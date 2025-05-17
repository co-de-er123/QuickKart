# 🛒 QuickKart – Android Shopping App

QuickKart is a full-featured Android e-commerce application built with Kotlin, MVVM architecture, and modern Android development tools. The app demonstrates real-world functionalities like user authentication, product listing, search, cart management, offline caching, and more.


---

## 🚀 Features

- 🔐 **Firebase Authentication** (Email, OTP)
- 📦 **Product listing** via REST API (Retrofit)
- 🔎 **Search and filter** products
- 🛒 **Cart functionality** with quantity updates
- 📡 **Offline support** using Room DB
- 🧠 **MVVM architecture** with LiveData & ViewModel
- 🎨 **Material Design** UI components
- 📱 **Responsive UI** tested on multiple devices

---


## 🛠️ Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM
- **UI**: Android Jetpack, Material Components
- **API**: Retrofit with `https://fakestoreapi.com/`
- **Local DB**: Room
- **Authentication**: Firebase Auth
- **Other**: LiveData, ViewModel, ViewBinding

---

## 🧩 Project Structure

```
QuickKart/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/quickkart/
│   │   │   │   ├── data/
│   │   │   │   │   ├── api/
│   │   │   │   │   │   └── ApiService.kt
│   │   │   │   │   ├── db/
│   │   │   │   │   │   ├── ProductDao.kt
│   │   │   │   │   │   └── AppDatabase.kt
│   │   │   │   │   ├── model/
│   │   │   │   │   │   └── Product.kt
│   │   │   │   │   └── repository/
│   │   │   │   │       └── ProductRepository.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── activities/
│   │   │   │   │   │   └── MainActivity.kt
│   │   │   │   │   ├── adapters/
│   │   │   │   │   │   └── ProductAdapter.kt
│   │   │   │   │   └── viewmodel/
│   │   │   │   │       └── ProductViewModel.kt
│   │   │   │   └── utils/
│   │   │   │       └── Constants.kt
│   │   │   └── AndroidManifest.xml
│   │   └── res/
│   │       ├── layout/
│   │       │   ├── activity_main.xml
│   │       │   └── item_product.xml
│   │       └── values/
│   │           └── strings.xml
│   └── build.gradle
├── build.gradle (Project level)
├── google-services.json
└── README.md
```

---


## 🧪 How to Run

1. Clone the repository:
   ```
   git clone https://github.com/your-username/QuickKart.git
   ```
   ---
  
Open the project in Android Studio.

Add your google-services.json to /app.

Make sure Firebase is properly set up:

Firebase Auth (Email & OTP enabled)

Build and run the app on an emulator or real device.
```

```
### 🧠 Learnings
Built real-world shopping features using clean architecture

Integrated Firebase Authentication securely

Improved UX through real-time search, caching, and UI optimizations

Learned how to manage app state using ViewModel + LiveData effectively
```

```
### 🙌 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.



