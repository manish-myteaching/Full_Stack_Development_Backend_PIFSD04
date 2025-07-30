# 🚀 Step-by-Step Guide: Install Apache Tomcat on Amazon Linux

## 📋 Prerequisites
- ✅ Amazon Linux EC2 instance with **minimum 1GB RAM**
- ✅ Port **8080** open in EC2 **Security Group**
- ✅ Access to terminal via SSH

---

## 🔧 Step 1: Install Java

Apache Tomcat requires Java. Use the command below to install Java 11:

```bash
sudo su -
amazon-linux-extras install java-openjdk11 -y
```

> 🔗 Check compatible Java version with Tomcat: [https://tomcat.apache.org/whichversion.html](https://tomcat.apache.org/whichversion.html)

---

## 📦 Step 2: Download and Extract Tomcat 10

```bash
cd /opt
wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.9/bin/apache-tomcat-10.1.9.tar.gz
tar -xvzf apache-tomcat-10.1.9.tar.gz
mv apache-tomcat-10.1.9 tomcat
```

---

## 👤 Step 3: Create a Dedicated Tomcat User

```bash
sudo su -
adduser tomcat
passwd tomcat
```

Enter and confirm the password when prompted.

---

## 🔑 Step 4: Set Ownership of Tomcat Directory

```bash
chown -R tomcat:tomcat /opt/tomcat
```

---

## ⚙️ Step 5: Configure Tomcat Users

Switch to the `tomcat` user:

```bash
su - tomcat
cd /opt/tomcat
vi conf/tomcat-users.xml
```

Add the following line **before `</tomcat-users>`**:

```xml
<user username="manish" password="manish" roles="manager-gui,manager-script,manager-jmx,manager-status"/>
```

Save and exit:
- Press `Esc`
- Type `:wq` and press `Enter`

---

## 🚫 Step 6: Comment `<Valve>` Tag in `context.xml` Files

```bash
cd /opt/tomcat
find . -name context.xml
```

Edit each of the following files and **comment out** the `<Valve>` tag (if present):

```bash
vi ./webapps/examples/META-INF/context.xml
vi ./webapps/host-manager/META-INF/context.xml
vi ./webapps/manager/META-INF/context.xml
```

---

## ✅ Step 7: Verify Execute Permission for Scripts

```bash
cd /opt/tomcat/bin
chmod +x catalina.sh startup.sh shutdown.sh
```

---

## 🔗 Step 8: Create Shortcut Commands (Optional)

> Note: Update paths if using Tomcat 10 instead of Tomcat 9

```bash
ln -s /opt/tomcat/bin/startup.sh /usr/local/bin/tomcatup
ln -s /opt/tomcat/bin/shutdown.sh /usr/local/bin/tomcatdown
```

---

## ▶️ Step 9: Start Tomcat Server

```bash
tomcatup
```

---

## 🌐 Step 10: Access Tomcat in Browser

Open your browser and enter:

```
http://<Your-EC2-Public-IP>:8080/
```

You should see the **Tomcat welcome page**!

To access advanced pages (Server Status, Manager App):

- **Username:** `sampath`
- **Password:** `sampath`

---

## 📸 Screenshots Reference

### Tomcat Dashboard
![Tomcat Home](https://user-images.githubusercontent.com/119833411/241392947-688e9545-db12-4f3e-8c57-e97e40520a50.jpg)

### Tomcat User Setup
![User Setup](https://user-images.githubusercontent.com/119833411/241391537-6601999f-5c4d-4bfc-a3b7-d759cd2a4397.jpg)

---

## ✅ Completed!

Tomcat is now running on your **Amazon Linux EC2** instance. You can deploy Java web apps via the Manager GUI or directly to `/opt/tomcat/webapps`.
