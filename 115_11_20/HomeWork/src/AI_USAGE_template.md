# 第七週AI使用紀錄

姓名／學號：王鈺婷 A114222042
工具及來源：ChatGPT（OpenAI，真實 AI 對話）

## 精簡紀錄

| 使用目的與 Prompt 摘要（註明來源） | 採納／拒絕與理由 | 本人驗證：預期、實際、證據位置 | 最終修改與 commit |
| ---- | ---- | ---- | ---- |
| ChatGPT：詢問如何在 IntelliJ IDEA 建立 Java 專案，以及將老師提供的程式檔案放進 src 資料夾。 | 採納。因為剛開始不熟悉 IntelliJ IDEA 的操作，需要按照步驟完成專案設定。 | 預期能成功建立 HomeWork 專案並開啟 Java 檔案。實際成功建立專案，並放入 Rover.java、HeavyRover.java、HeavyRoverTry.java。證據位置：HomeWork/src。 | 完成專案建立與檔案整理；commit 待補。 |
| ChatGPT：詢問這次回家作業要做什麼，以及 HeavyRover.java 裡面的 TODO 應如何完成。 | 採納。AI 協助我理解作業要求，包括記錄鑽探次數、能源扣除，以及成功鑽探後的狀態更新。 | 預期 HeavyRover 能繼承 Rover，並使用父類別的方法更新狀態。實際依照說明完成相關程式。證據位置：HeavyRover.java。 | 新增 drillCount，完成建構子初始化、getDrillCount() 與 drill()；commit 待補。 |
| ChatGPT：詢問如何完成 Rover.java 的 spendEnergy()，以及如何修改 explore() 和 scan()。 | 採納。透過 spendEnergy() 統一處理能源扣除，可以避免相同邏輯重複出現在不同方法中。 | 預期能源足夠才扣除，能源不足則不改變狀態。實際完成修改，後續測試結果與預期相符。證據位置：Rover.java、HeavyRoverTry.java 執行結果。 | 完成 spendEnergy()，並修改 explore()、scan()；commit 待補。 |
| ChatGPT：詢問如何檢查程式是否完成，以及如何執行 HeavyRoverTry.java。 | 採納。老師已經提供測試程式，可以直接用測試結果確認修改是否符合要求。 | 預期測試顯示「相符」。實際執行後，畫面中各項測試均顯示「相符」，最後出現 Process finished with exit code 0。證據位置：IntelliJ IDEA 的 Run 執行結果，相關檔案為 HeavyRoverTry.java。 | 完成測試，目前未再修改；GitHub commit 待補。 |

## 反思

- **哪個案例讓我發現「回成功卻沒更新正確狀態」：**

  這次讓我比較有印象的是 HeavyRover 的鑽探功能。原本以為只要讓程式回傳「成功」就可以，但後來發現還要確認能源有沒有扣除、樣本數有沒有增加，以及行動次數和鑽探次數是否正確。這讓我知道不能只看程式有沒有執行，也要檢查執行後的數值。

- **我保留或拒絕 AI 建議的理由：**

  我採用了 ChatGPT 提供的程式修改建議，因為這些修改符合老師提供的 TODO 說明，也能透過測試程式檢查結果。另外，我保留老師原本提供的類別架構，沒有重新設計整個程式，避免把作業要求改掉。

- **我仍無法解釋或尚未完成的部分：**

  目前可以按照步驟完成程式修改與測試，但對於 Java 繼承、protected 方法，以及子類別如何透過父類別的方法修改資料，還需要再多練習。程式測試已完成，GitHub 上傳與 commit 紀錄尚待完成。
