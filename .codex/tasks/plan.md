# .codex/tasks/plan.md

## 任务列表

### T001

- name: 搭建最小可运行的 PR 与 CI 演练仓库
- desc: 初始化 Git 仓库并创建一个最小 Maven Java 项目，包含单元测试、GitHub Actions CI 工作流和练习说明，让用户可以完整体验分支开发、提交 PR 和自动检查通过的流程
- status: true
- files:
  - pom.xml
  - src/main/java/com/example/App.java
  - src/test/java/com/example/AppTest.java
  - .github/workflows/ci.yml
  - README.md
- tests:
  - src/test/java/com/example/AppTest.java
- note: 当前任务只交付最小可运行的演练基础设施，不提前实现 PR 评论抓取或自动修复脚本

### T002

- name: 增加 PR 模板与评审演练材料
- desc: 补充 Pull Request 模板、Review 检查清单和一份模拟评审意见，帮助用户练习“提 PR 后如何看评论并修正”
- status: false
- files:
  - .github/pull_request_template.md
  - docs/review-playbook.md
  - docs/sample-review-comments.md
- tests:
  - N/A
- note: 仅在 T001 完成后再开始，避免在仓库不可运行时先写流程材料

### T003

- name: 增加 GH CLI 自动化与后续进阶说明
- desc: 补充基于 gh CLI 的常用命令清单和 CI 失败后的排查流程说明，为后续接入 gh-fix-ci 与 gh-address-comments 技能做准备
- status: false
- files:
  - docs/gh-cli-playbook.md
  - docs/ci-troubleshooting.md
- tests:
  - N/A
- note: 当前不直接接 GitHub API 或 MCP，只提供进阶演练路线
