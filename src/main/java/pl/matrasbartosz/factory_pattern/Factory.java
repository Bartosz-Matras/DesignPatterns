package pl.matrasbartosz.factory_pattern;

abstract class Factory {
    public abstract BMW buildBmw(BMWModel bmwModel);
    public abstract Ford buildFord(FordModel fordModel);
}
