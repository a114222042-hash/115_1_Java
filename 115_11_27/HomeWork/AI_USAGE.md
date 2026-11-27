# 第八週 AI 使用與驗證紀錄

學生姓名／學號：A114222042王鈺婷

使用工具：ChatGPT
使用日期：2026/11/27

| 使用目的與來源 | Prompt／建議摘要 | 採納或拒絕及理由 | 人工驗證方式與結果 | 最終修改 |
|---|---|---|---|---|
| 使用 ChatGPT 協助完成 TODO 1 | 如何使用 exploreYield() 取得探索產量 | 採納，讓不同車種可以有不同產量 | 執行 CompareMissions，重型車樣本數為6 | 將 addSamples(2) 改為 addSamples(exploreYield()) |
| 使用 ChatGPT 協助完成 TODO 2 | 如何覆寫重型探測車的探索產量 | 採納，符合重型車每次探索取得3份樣本的要求 | 執行 HeavyRoverTry，畫面可見的測試結果相符 | 加入 @Override 並覆寫 exploreYield() |
| 使用 ChatGPT 協助完成 TODO 3 | 如何建立兩台探測車並比較任務結果 | 採納，兩台車應使用獨立的 Mission | 執行 CompareMissions，程式正常結束 | 建立兩台探測車及各自的 Mission，執行相同腳本 |
| 使用 ChatGPT 協助完成 TODO 4 | 如何讓重型探測車執行指令4 | 採納，其他指令可以沿用父類別的方法 | 執行 DrillMissionTry，畫面可見的測試結果相符 | 覆寫 execute()，指令4呼叫 drill()，其他指令使用 super.execute() |

## 本人 E1 預測

父類別的 private 方法不能直接被子類別覆寫。
如果在 HeavyRover 新增同名的 private explore()，
即使可以編譯，也無法改變父類別原本的探索產量。
應改為覆寫 protected exploreYield()。

## 修正前 commit／證據

未另外建立修正前 commit。
原始 starter 程式碼保留於第八週教材資料夾。

## 修正後 commit／相同案例重測

已完成 TODO 1～4 的程式修改，並執行以下測試：

- CompareMissions：正常執行。
- HeavyRoverTry：畫面可見的測試結果相符。
- DrillMissionTry：畫面可見的測試結果相符。
- 三個程式皆以 exit code 0 正常結束。

GitHub commit 編號於正式上傳後補填。
尚未另外執行 E1 錯誤版本的對照測試。

## 三至五句補強 Prompt

1. 請保留父類別原本的行動規則，不要重複宣告能源和樣本欄位。
2. 請使用 @Override 覆寫指定方法。
3. 請使用 super.execute() 處理其他指令。
4. 請檢查能源不足、任務停止及無效指令的情況。
5. 請提供預期結果，讓我能自行執行程式並比對。

## 學習心得

這次作業讓我了解 Java 的繼承、覆寫及多型。
透過 AI 協助理解程式碼，再自行修改並執行測試，
我發現子類別可以沿用父類別的功能，
只修改需要改變的部分，不必重新撰寫全部程式碼。
