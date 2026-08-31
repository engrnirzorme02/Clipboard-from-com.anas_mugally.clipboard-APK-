package p259h3;

/* JADX INFO: renamed from: h3.B */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5557B implements InterfaceC5593a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a */
    private final int f21428a;

    EnumC5557B(int i7) {
        this.f21428a = i7;
    }

    @Override // p259h3.InterfaceC5593a
    /* JADX INFO: renamed from: c */
    public int mo24993c() {
        return this.f21428a;
    }
}
