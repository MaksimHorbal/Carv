package com.horbal.carv.problem1

data class Circle(
    val x: Float,
    val y: Float,
    val radius: Float,
) {

    init {
        require(x >= 0f)
        require(y >= 0f)
        require(radius >= 0f)
    }
}

val predefinedCircles = listOf(
    Circle(18.81799f, 35.7445f, 12f),
    Circle(23.13299f, 16.8974f, 12f),
    Circle(16.21079f, 0f, 12f),
    Circle(4.51639f, 12.8394f, 12f),
    Circle(1.0195f, 30.0177f, 12f),
    Circle(0f, 47.8785f, 12f),
    Circle(16.79069f, 75.0814f, 12f),
    Circle(17.37789f, 55.0006f, 12f),
    Circle(0.09226f, 66.3364f, 12f),
    Circle(1.20363f, 85.2964f, 12f),
    Circle(5.23729f, 103.1604f, 12f),
    Circle(10.80269f, 119.8994f, 12f),
    Circle(49.83219f, 76.6024f, 12f),
    Circle(48.60009f, 57.5435f, 12f),
    Circle(32.11859f, 65.6744f, 12f),
    Circle(34.12719f, 84.2464f, 12f),
    Circle(20.07639f, 94.9624f, 12f),
    Circle(28.51799f, 111.0354f, 12f),
    Circle(61.30659f, 46.0354f, 12f),
    Circle(56.13399f, 28.9682f, 12f),
    Circle(48.50349f, 11.5261f, 12f),
    Circle(34.56289f, 0.3548f, 12f),
    Circle(38.17069f, 27.5453f, 12f),
    Circle(35.22639f, 44.9827f, 12f),
    Circle(55.04799f, 198.3864f, 12f),
    Circle(55.88789f, 179.9024f, 12f),
    Circle(56.84219f, 161.4354f, 12f),
    Circle(43.50699f, 149.4534f, 12f),
    Circle(59.07229f, 141.0914f, 12f),
    Circle(62.15939f, 123.2974f, 12f),
    Circle(65.10429f, 104.7454f, 12f),
    Circle(66.15519f, 85.8874f, 12f),
    Circle(48.01899f, 96.2824f, 12f),
    Circle(64.90409f, 65.8474f, 12f),
    Circle(46.53939f, 113.7714f, 12f),
    Circle(40.33179f, 131.1734f, 12f),
    Circle(18.88199f, 167.2574f, 12f),
    Circle(19.26569f, 185.1634f, 12f),
    Circle(19.54539f, 203.4754f, 12f),
    Circle(54.23549f, 216.9704f, 12f),
    Circle(37.64889f, 188.5244f, 12f),
    Circle(38.30579f, 169.7164f, 12f),
    Circle(20.17889f, 222.1694f, 12f),
    Circle(24.26149f, 242.2284f, 12f),
    Circle(41.02829f, 248.7884f, 12f),
    Circle(36.41349f, 226.8844f, 12f),
    Circle(51.71179f, 235.2194f, 12f),
    Circle(37.39319f, 208.1334f, 12f)
)