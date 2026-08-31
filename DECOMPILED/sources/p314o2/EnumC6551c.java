package p314o2;

/* JADX INFO: renamed from: o2.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6551c {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a */
    private final int f24733a;

    EnumC6551c(int i7) {
        this.f24733a = i7;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC6551c m27812c(int i7) {
        for (EnumC6551c enumC6551c : values()) {
            if (enumC6551c.m27813d() == i7) {
                return enumC6551c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public int m27813d() {
        return this.f24733a;
    }
}
