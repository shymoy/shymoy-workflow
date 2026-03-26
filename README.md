# TCP PR / CI Demo

这是一个最小可运行的 GitHub PR + CI 演练仓库，适合你练习下面这套流程：

1. 本地新建功能分支
2. 编写代码并通过单元测试
3. 推送分支并创建 Pull Request
4. 让 GitHub Actions 自动执行 `mvn clean verify`
5. 根据 Review 评论继续修改，直到可以合并

## 项目结构

- `src/main/java/com/example/App.java`: 示例业务代码
- `src/test/java/com/example/AppTest.java`: 示例单元测试
- `.github/workflows/ci.yml`: PR 和 main 分支的自动检查

## 本地跑通

```bash
mvn clean verify
```

## 一次完整练习

### 1. 初始化远程仓库

如果你还没把这个目录放到 GitHub：

```bash
git branch -M main
git add .
git commit -m "chore: bootstrap pr ci demo"
git remote add origin <your-github-repo-url>
git push -u origin main
```

### 2. 新功能分支开发

```bash
git checkout -b feat/pr-practice
```

建议你做一个很小的练习改动，比如：

- 给 `App` 新增一个方法
- 先写对应测试
- 再实现代码

完成后：

```bash
git add -A
git commit -m "feat: add pr practice method"
git push -u origin feat/pr-practice
```

### 3. 创建 Pull Request

如果已经安装并登录 `gh`：

```bash
gh pr create --fill
```

你会看到一个 PR，随后 GitHub Actions 会自动触发：

- `pull_request` 事件运行 `mvn -B clean verify`
- 只要测试失败，PR 就会显示红色状态
- 修复后再次 push，CI 会重新执行

### 4. 模拟一次 Review

你可以按下面方式自己练习：

1. 在 GitHub PR 页面给自己留一条评论
2. 回到本地按评论修改代码
3. 再次执行 `mvn clean verify`
4. `git add -A && git commit -m "fix: address review comment"`
5. `git push`

### 5. 合并 PR

CI 通过且评论处理完后：

```bash
gh pr merge --squash --auto
```

## 怎么故意制造一次 CI 失败

为了理解 CI 的作用，你可以做一次“故意失败”的练习：

1. 修改 `AppTest` 的断言，让它和当前实现不一致
2. 本地不要修，直接提交并 push
3. 打开 PR，观察 GitHub Actions 失败
4. 修复代码或修复测试
5. 再 push，看状态从红变绿

## 下一步可以继续加什么

- PR 模板
- Review 检查清单
- `gh run view --log` 的失败排查脚本
- 自动读取评论并修复的 MCP / Agent 能力

## 本地练习提交示例

如果你只是想先练一次最小提交流程，可以直接这样做：

```bash
git checkout -b feat/local-pr-practice
git add -A
git commit -m "docs: add local practice note"
```
