package p252g4;

/* JADX INFO: renamed from: g4.D */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5466D {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a */
    private final int f20784a;

    EnumC5466D(int i7) {
        this.f20784a = i7;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC5466D m24684d(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* JADX INFO: renamed from: h */
    public int m24685h() {
        return this.f20784a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f20784a);
    }
}
