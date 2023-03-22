<%--
  Created by IntelliJ IDEA.
  User: chs
  Date: 2023/03/20
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script>
    const memoList = document.getElementById("menu");

    function addMemoToList(memo) {
        const memoItem = document.createElement("li");
        const memoLink = document.createElement("a");
        memoLink.textContent = memo.title;
        memoLink.href = "#";
        memoLink.addEventListener("click", function() {
            showMemo(memo);
        });
        memoItem.appendChild(memoLink);
        memoList.appendChild(memoItem);
    }

    function updateMemoList() {
        memoList.innerHTML = "";
        const memos = JSON.parse(localStorage.getItem("memos") || "[]");
        for (const memo of memos) {
            addMemoToList(memo);
        }
    }

    updateMemoList();



</script>

<body>
<header>
    <h1>나만의 메모장</h1>
</header>

<nav>
    <ul id="menu">
    </ul>
</nav>

<main>
    <div class="memo-form">
        <h2>메모 작성</h2>
        <form>
            <label for="memo-title">제목</label>
            <input type="text" id="memo-title" name="memo-title">
            <label for="memo-content">내용</label>
            <textarea id="memo-content" name="memo-content"></textarea>
            <button type="button" id="memo-submit">저장</button>
        </form>
    </div>
</main>

<script src="./app.js"></script>
</body>
