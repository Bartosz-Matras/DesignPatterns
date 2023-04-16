package pl.matrasbartosz.factory_pattern;

abstract class Factory {
    abstract public BMW buildBmw(BMWModel bmwModel);
    abstract public Ford buildFord(FordModel fordModel);
}
