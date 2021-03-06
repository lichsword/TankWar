package com.caixihua.game;



public class Maps {
	
	//private static Random random = new Random();

	// 地图
	private static Wall[][] maps = { 
			{
				/*
				 *  boss
				 */
				new Wall(300,700,1,1,Wall.BRICK),
				new Wall(300,675,1,1,Wall.BRICK),
				new Wall(300,650,1,1,Wall.BRICK),
				new Wall(325,650,1,1,Wall.BRICK),
				new Wall(350,650,1,1,Wall.BRICK),
				new Wall(375,650,1,1,Wall.BRICK),
				new Wall(375,675,1,1,Wall.BRICK),
				new Wall(375,700,1,1,Wall.BRICK),
				/*
				 *  steel
				 */
				new Wall(325,575,1,1,Wall.STEEL),
				new Wall(325,550,1,1,Wall.STEEL),
				new Wall(350,575,1,1,Wall.STEEL),
				new Wall(350,550,1,1,Wall.STEEL),
				//
				new Wall(525, 500, 1, 1, Wall.STEEL),
				new Wall(525, 475, 1, 1, Wall.STEEL),
				new Wall(500, 500, 1, 1, Wall.STEEL),
				new Wall(500, 475, 1, 1, Wall.STEEL),
				//
				new Wall(150, 500, 1, 1, Wall.STEEL),
				new Wall(150, 475, 1, 1, Wall.STEEL),
				new Wall(175, 500, 1, 1, Wall.STEEL),
				new Wall(175, 475, 1, 1, Wall.STEEL),
				/*
				 *  brick
				 */
				new Wall(50, 650, 1, 1, Wall.BRICK),
				new Wall(50, 625, 1, 1, Wall.BRICK),
				new Wall(50, 600, 1, 1, Wall.BRICK),
				new Wall(50, 575, 1, 1, Wall.BRICK),
				new Wall(50, 550, 1, 1, Wall.BRICK),
				new Wall(50, 525, 1, 1, Wall.BRICK),
				new Wall(50, 500, 1, 1, Wall.BRICK),
				new Wall(50, 475, 1, 1, Wall.BRICK),
				new Wall(75, 650, 1, 1, Wall.BRICK),
				new Wall(75, 625, 1, 1, Wall.BRICK),
				new Wall(75, 600, 1, 1, Wall.BRICK),
				new Wall(75, 575, 1, 1, Wall.BRICK),
				new Wall(75, 550, 1, 1, Wall.BRICK),
				new Wall(75, 525, 1, 1, Wall.BRICK),
				new Wall(75, 500, 1, 1, Wall.BRICK),
				new Wall(75, 475, 1, 1, Wall.BRICK),
				// 第二堵
				new Wall(150, 650, 1, 1, Wall.BRICK),
				new Wall(150, 625, 1, 1, Wall.BRICK),
				new Wall(150, 600, 1, 1, Wall.BRICK),
				new Wall(150, 575, 1, 1, Wall.BRICK),
				new Wall(150, 550, 1, 1, Wall.BRICK),
				new Wall(150, 525, 1, 1, Wall.BRICK),
				new Wall(175, 650, 1, 1, Wall.BRICK),
				new Wall(175, 625, 1, 1, Wall.BRICK),
				new Wall(175, 600, 1, 1, Wall.BRICK),
				new Wall(175, 575, 1, 1, Wall.BRICK),
				new Wall(175, 550, 1, 1, Wall.BRICK),
				new Wall(175, 525, 1, 1, Wall.BRICK),
				//  第三堵
				new Wall(250, 475, 1, 1, Wall.BRICK),
				new Wall(275, 475, 1, 1, Wall.BRICK),
				new Wall(300, 475, 1, 1, Wall.BRICK),
				new Wall(325, 475, 1, 1, Wall.BRICK),
				new Wall(350, 475, 1, 1, Wall.BRICK),
				new Wall(375, 475, 1, 1, Wall.BRICK),
				new Wall(400, 475, 1, 1, Wall.BRICK),
				new Wall(425, 475, 1, 1, Wall.BRICK),
				new Wall(250, 500, 1, 1, Wall.BRICK),
				new Wall(275, 500, 1, 1, Wall.BRICK),
				new Wall(300, 500, 1, 1, Wall.BRICK),
				new Wall(325, 500, 1, 1, Wall.BRICK),
				new Wall(350, 500, 1, 1, Wall.BRICK),
				new Wall(375, 500, 1, 1, Wall.BRICK),
				new Wall(400, 500, 1, 1, Wall.BRICK),
				new Wall(425, 500, 1, 1, Wall.BRICK),
				new Wall(250, 525, 1, 1, Wall.BRICK),
				new Wall(275, 525, 1, 1, Wall.BRICK),
				new Wall(300, 525, 1, 1, Wall.BRICK),
				new Wall(325, 525, 1, 1, Wall.BRICK),
				new Wall(350, 525, 1, 1, Wall.BRICK),
				new Wall(375, 525, 1, 1, Wall.BRICK),
				new Wall(400, 525, 1, 1, Wall.BRICK),
				new Wall(425, 525, 1, 1, Wall.BRICK),
				new Wall(250, 550, 1, 1, Wall.BRICK),
				new Wall(275, 550, 1, 1, Wall.BRICK),
				new Wall(300, 550, 1, 1, Wall.BRICK),
				new Wall(375, 550, 1, 1, Wall.BRICK),
				new Wall(400, 550, 1, 1, Wall.BRICK),
				new Wall(425, 550, 1, 1, Wall.BRICK),
				new Wall(250, 575, 1, 1, Wall.BRICK),
				new Wall(275, 575, 1, 1, Wall.BRICK),
				new Wall(300, 575, 1, 1, Wall.BRICK),
				new Wall(375, 575, 1, 1, Wall.BRICK),
				new Wall(400, 575, 1, 1, Wall.BRICK),
				new Wall(425, 575, 1, 1, Wall.BRICK),
				// 第四堵
				new Wall(500, 650, 1, 1, Wall.BRICK),
				new Wall(500, 625, 1, 1, Wall.BRICK),
				new Wall(500, 600, 1, 1, Wall.BRICK),
				new Wall(500, 575, 1, 1, Wall.BRICK),
				new Wall(500, 550, 1, 1, Wall.BRICK),
				new Wall(500, 525, 1, 1, Wall.BRICK),
				new Wall(525, 650, 1, 1, Wall.BRICK),
				new Wall(525, 625, 1, 1, Wall.BRICK),
				new Wall(525, 600, 1, 1, Wall.BRICK),
				new Wall(525, 575, 1, 1, Wall.BRICK),
				new Wall(525, 550, 1, 1, Wall.BRICK),
				new Wall(525, 525, 1, 1, Wall.BRICK),
				// 第五堵
				new Wall(600, 650, 1, 1, Wall.BRICK),
				new Wall(600, 625, 1, 1, Wall.BRICK),
				new Wall(600, 600, 1, 1, Wall.BRICK),
				new Wall(600, 575, 1, 1, Wall.BRICK),
				new Wall(600, 550, 1, 1, Wall.BRICK),
				new Wall(600, 525, 1, 1, Wall.BRICK),
				new Wall(600, 500, 1, 1, Wall.BRICK),
				new Wall(600, 475, 1, 1, Wall.BRICK),
				new Wall(625, 650, 1, 1, Wall.BRICK),
				new Wall(625, 625, 1, 1, Wall.BRICK),
				new Wall(625, 600, 1, 1, Wall.BRICK),
				new Wall(625, 575, 1, 1, Wall.BRICK),
				new Wall(625, 550, 1, 1, Wall.BRICK),
				new Wall(625, 525, 1, 1, Wall.BRICK),
				new Wall(625, 500, 1, 1, Wall.BRICK),
				new Wall(625, 475, 1, 1, Wall.BRICK),
				// Java字样
				// J
				new Wall(50,150,1,1,Wall.BRICK),
				new Wall(75,150,1,1,Wall.BRICK),
				new Wall(100,150,1,1,Wall.BRICK),
				new Wall(125,150,1,1,Wall.BRICK),
				new Wall(150,150,1,1,Wall.BRICK),
				new Wall(125,175,1,1,Wall.BRICK),
				new Wall(125,200,1,1,Wall.BRICK),
				new Wall(125,225,1,1,Wall.BRICK),
				new Wall(125,250,1,1,Wall.BRICK),
				new Wall(125,275,1,1,Wall.BRICK),
				new Wall(100,300,1,1,Wall.BRICK),
				new Wall(75,325,1,1,Wall.BRICK),
				new Wall(50,325,1,1,Wall.BRICK),
				// A
				new Wall(200,200,1,1,Wall.BRICK),
				new Wall(200,225,1,1,Wall.BRICK),
				new Wall(200,250,1,1,Wall.BRICK),
				new Wall(200,275,1,1,Wall.BRICK),
				new Wall(200,300,1,1,Wall.BRICK),
				new Wall(200,325,1,1,Wall.BRICK),
				new Wall(225,175,1,1,Wall.BRICK),
				new Wall(250,150,1,1,Wall.BRICK),
				new Wall(275,175,1,1,Wall.BRICK),
				new Wall(300,200,1,1,Wall.BRICK),
				new Wall(300,225,1,1,Wall.BRICK),
				new Wall(300,250,1,1,Wall.BRICK),
				new Wall(300,275,1,1,Wall.BRICK),
				new Wall(300,300,1,1,Wall.BRICK),
				new Wall(300,325,1,1,Wall.BRICK),
				new Wall(225,250,1,1,Wall.BRICK),
				new Wall(250,250,1,1,Wall.BRICK),
				new Wall(275,250,1,1,Wall.BRICK),
				// V
				new Wall(350,150,1,1,Wall.BRICK),
				new Wall(350,175,1,1,Wall.BRICK),
				new Wall(350,200,1,1,Wall.BRICK),
				new Wall(350,225,1,1,Wall.BRICK),
				new Wall(350,250,1,1,Wall.BRICK),
				new Wall(350,275,1,1,Wall.BRICK),
				new Wall(375,300,1,1,Wall.BRICK),
				new Wall(400,325,1,1,Wall.BRICK),
				new Wall(425,300,1,1,Wall.BRICK),
				new Wall(450,275,1,1,Wall.BRICK),
				new Wall(450,250,1,1,Wall.BRICK),
				new Wall(450,225,1,1,Wall.BRICK),
				new Wall(450,200,1,1,Wall.BRICK),
				new Wall(450,175,1,1,Wall.BRICK),
				new Wall(450,150,1,1,Wall.BRICK),
				// A
				new Wall(500,200,1,1,Wall.BRICK),
				new Wall(500,225,1,1,Wall.BRICK),
				new Wall(500,250,1,1,Wall.BRICK),
				new Wall(500,275,1,1,Wall.BRICK),
				new Wall(500,300,1,1,Wall.BRICK),
				new Wall(500,325,1,1,Wall.BRICK),
				new Wall(525,175,1,1,Wall.BRICK),
				new Wall(550,150,1,1,Wall.BRICK),
				new Wall(575,175,1,1,Wall.BRICK),
				new Wall(600,200,1,1,Wall.BRICK),
				new Wall(600,225,1,1,Wall.BRICK),
				new Wall(600,250,1,1,Wall.BRICK),
				new Wall(600,275,1,1,Wall.BRICK),
				new Wall(600,300,1,1,Wall.BRICK),
				new Wall(600,325,1,1,Wall.BRICK),
				new Wall(525,250,1,1,Wall.BRICK),
				new Wall(550,250,1,1,Wall.BRICK),
				new Wall(575,250,1,1,Wall.BRICK),
				// top
				new Wall(0, 100, 1, 1, Wall.BRICK),
				new Wall(25, 100, 1, 1, Wall.BRICK),
				new Wall(50, 100, 1, 1, Wall.BRICK),
				new Wall(75, 100, 1, 1, Wall.BRICK),
				new Wall(100, 100, 1, 1, Wall.BRICK),
				new Wall(125, 100, 1, 1, Wall.BRICK),
				new Wall(150, 100, 1, 1, Wall.BRICK),
				new Wall(175, 100, 1, 1, Wall.BRICK),
				new Wall(200, 100, 1, 1, Wall.BRICK),
				new Wall(225, 100, 1, 1, Wall.BRICK),
				new Wall(250, 100, 1, 1, Wall.BRICK),
				new Wall(275, 100, 1, 1, Wall.BRICK),
				new Wall(300, 100, 1, 1, Wall.BRICK),
				new Wall(325, 100, 1, 1, Wall.BRICK),
				new Wall(350, 100, 1, 1, Wall.BRICK),
				new Wall(375, 100, 1, 1, Wall.BRICK),
				new Wall(400, 100, 1, 1, Wall.BRICK),
				new Wall(425, 100, 1, 1, Wall.BRICK),
				new Wall(450, 100, 1, 1, Wall.BRICK),
				new Wall(475, 100, 1, 1, Wall.BRICK),
				new Wall(500, 100, 1, 1, Wall.BRICK),
				new Wall(525, 100, 1, 1, Wall.BRICK),
				new Wall(550, 100, 1, 1, Wall.BRICK),
				new Wall(575, 100, 1, 1, Wall.BRICK),
				new Wall(600, 100, 1, 1, Wall.BRICK),
				new Wall(625, 100, 1, 1, Wall.BRICK),
				new Wall(650, 100, 1, 1, Wall.BRICK),
				new Wall(675, 100, 1, 1, Wall.BRICK),
				/*
				 *  sea
				 */
				new Wall(0, 375, 2, 2, Wall.SEA),
				new Wall(50, 375, 2, 2, Wall.SEA),
				new Wall(650, 375, 2, 2, Wall.SEA),
				new Wall(600, 375, 2, 2, Wall.SEA),
				/*
				 *  forest
				 */
				new Wall(0, 425, 2, 2, Wall.FOREST),
				new Wall(0, 475, 2, 2, Wall.FOREST),
				new Wall(0, 525, 2, 2, Wall.FOREST),
				new Wall(0, 575, 2, 2, Wall.FOREST),
				new Wall(0, 625, 2, 2, Wall.FOREST),
				new Wall(0, 675, 2, 2, Wall.FOREST),
				new Wall(50, 675, 2, 2, Wall.FOREST),
				//
				new Wall(650, 425, 2, 2, Wall.FOREST),
				new Wall(650, 475, 2, 2, Wall.FOREST),
				new Wall(650, 525, 2, 2, Wall.FOREST),
				new Wall(650, 575, 2, 2, Wall.FOREST),
				new Wall(650, 625, 2, 2, Wall.FOREST),
				new Wall(650, 675, 2, 2, Wall.FOREST),
				new Wall(600, 675, 2, 2, Wall.FOREST),
				//
				new Wall(100, 375, 2, 2, Wall.FOREST),
				new Wall(150, 375, 2, 2, Wall.FOREST),
				new Wall(200, 375, 2, 2, Wall.FOREST),
				new Wall(250, 375, 2, 2, Wall.FOREST),
				new Wall(300, 375, 2, 2, Wall.FOREST),
				new Wall(350, 375, 2, 2, Wall.FOREST),
				new Wall(400, 375, 2, 2, Wall.FOREST),
				new Wall(450, 375, 2, 2, Wall.FOREST),
				new Wall(500, 375, 2, 2, Wall.FOREST),
				new Wall(550, 375, 2, 2, Wall.FOREST),
				/*
				 *  ice
				 */
				// left
				new Wall(0, 325, 2, 2, Wall.ICE),
				new Wall(0, 275, 2, 2, Wall.ICE),
				new Wall(0, 225, 2, 2, Wall.ICE),
				new Wall(0, 175, 2, 2, Wall.ICE),
				new Wall(0, 125, 2, 2, Wall.ICE),
				// right
				new Wall(650, 325, 2, 2, Wall.ICE),
				new Wall(650, 325, 2, 2, Wall.ICE),
				new Wall(650, 275, 2, 2, Wall.ICE),
				new Wall(650, 225, 2, 2, Wall.ICE),
				new Wall(650, 175, 2, 2, Wall.ICE),
				new Wall(650, 125, 2, 2, Wall.ICE),
				
	}
	};
	
	public static Wall[] getMaps(){
		// 获得地图的数组
		return maps[0];
	}

}
