//package org.test.marshmello;
//
//import org.junit.Test;
//
////private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
//
//public void testQueryMenuList() {
//        // 原始的数据
//        List<Menu> rootMenu = menuDao.queryMenuList(null);
//
//        // 查看结果
//        for (Menu menu : rootMenu) {
//        System.out.println(menu);
//        }
//        // 最后的结果
//        List<Menu> menuList = new ArrayList<Menu>();
//        // 先找到所有的一级菜单
//        for (int i = 0; i < rootMenu.size(); i++) {
//        // 一级菜单没有parentId
//        if (StringUtils.isBlank(rootMenu.get(i).getParentId())) {
//        menuList.add(rootMenu.get(i));
//        }
//        }
//        // 为一级菜单设置子菜单，getChild是递归调用的
//        for (Menu menu : menuList) {
//        menu.setChildMenus(getChild(menu.getId(), rootMenu));
//        }
//        Map<String,Object> jsonMap = new HashMap<>();
//        jsonMap.put("menu", menuList);
//        System.out.println(gson.toJson(jsonMap));
//
//        }