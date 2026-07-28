// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getFirestore } from "firebase/firestore";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyC3cg1fm5vLBs7xT5XKQzjNirHF5wFcCBg",
  authDomain: "bharatreals.firebaseapp.com",
  databaseURL:
    "https://bharatreals-default-rtdb.asia-southeast1.firebasedatabase.app",
  projectId: "bharatreals",
  storageBucket: "bharatreals.appspot.com",
  messagingSenderId: "132153390664",
  appId: "1:132153390664:web:6aa1b9bbc3528b89bb8a7d",
  measurementId: "G-5362CW1T85",
};

// Initialize Firebase
initializeApp(firebaseConfig);
export const db = getFirestore();

