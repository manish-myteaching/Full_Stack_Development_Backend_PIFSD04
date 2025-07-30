# 🚀 Step-by-Step Guide: Install Apache Tomcat on Amazon Linux (EC2)

This guide helps you install **Apache Tomcat 10.1.9** on an **Amazon Linux EC2** instance using a dedicated user and secure configuration.

---

## 📋 Prerequisites

- ✅ Amazon Linux EC2 Instance (t2.micro or higher, 1GB+ RAM)
- ✅ Port **8080** opened in the **EC2 Security Group**
- ✅ SSH access to your instance

---

## 🔧 Step 1: Install Java 11

Apache Tomcat 10 requires Java 11+.

```bash
sudo su -
amazon-linux-extras install java-openjdk11 -y
```

🔗 Java compatibility with Tomcat: [Which Java Version?](https://tomcat.apache.org/whichversion.html)

---

## 📦 Step 2: Download & Extract Apache Tomcat 10.1.9

```bash
cd /opt
wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.9/bin/apache-tomcat-10.1.9.tar.gz
tar -xvzf apache-tomcat-10.1.9.tar.gz
mv apache-tomcat-10.1.9 tomcat
```

---

## 👤 Step 3: Create a Dedicated `tomcat` User

```bash
adduser tomcat
passwd tomcat
```

💡 This avoids running Tomcat as root.

---

## 🔑 Step 4: Set Ownership to `tomcat` User

```bash
chown -R tomcat:tomcat /opt/tomcat
```

---

## ⚙️ Step 5: Configure Tomcat Manager Credentials

```bash
su - tomcat
cd /opt/tomcat
vi conf/tomcat-users.xml
```

Add this inside `<tomcat-users>` tag:

```xml
<user username="sampath" password="sampath" roles="manager-gui,manager-script,manager-jmx,manager-status"/>
```

---

## 🚫 Step 6: Enable Remote Access to Manager Apps

Find and edit the following files:

```bash
cd /opt/tomcat
find . -name context.xml
```

Modify the below files to comment out `<Valve>`:

```bash
vi webapps/manager/META-INF/context.xml
vi webapps/host-manager/META-INF/context.xml
vi webapps/examples/META-INF/context.xml
```

Example:

```xml
<!-- <Valve className="org.apache.catalina.valves.RemoteAddrValve"
       allow="127\.\d+\.\d+\.\d+|::1" /> -->
```

---

## ✅ Step 7: Ensure Execute Permission on Scripts

```bash
cd /opt/tomcat/bin
chmod +x *.sh
```

---

## 🔗 Step 8: Create Tomcat Start/Stop Shortcuts (Optional)

```bash
ln -s /opt/tomcat/bin/startup.sh /usr/local/bin/tomcatup
ln -s /opt/tomcat/bin/shutdown.sh /usr/local/bin/tomcatdown
```

---

## ▶️ Step 9: Start Tomcat Server

```bash
tomcatup
```

Or directly:

```bash
/opt/tomcat/bin/startup.sh
```

---

## 🌐 Step 10: Access Tomcat in Browser

Navigate to:

```
http://<Your-EC2-Public-IP>:8080/
```

Use the credentials to access manager pages:

- Username: `manish`
- Password: `manish`

---

## 📸 Screenshots

### Tomcat Default Page

![Tomcat Home](https://user-images.githubusercontent.com/119833411/241392947-688e9545-db12-4f3e-8c57-e97e40520a50.jpg)

### Tomcat User Configuration

![User Setup](https://user-images.githubusercontent.com/119833411/241391537-6601999f-5c4d-4bfc-a3b7-d759cd2a4397.jpg)

---

## ✅ Success!

Tomcat 10 is now running on your Amazon Linux EC2 instance.

📂 Deploy your WAR files to: `/opt/tomcat/webapps`

🔐 Secure production deployments using a reverse proxy and HTTPS.

