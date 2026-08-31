package p259h3;

/* JADX INFO: renamed from: h3.p */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5623p implements InterfaceC5593a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a */
    private final int f21543a;

    EnumC5623p(int i7) {
        this.f21543a = i7;
    }

    @Override // p259h3.InterfaceC5593a
    /* JADX INFO: renamed from: c */
    public int mo24993c() {
        return this.f21543a;
    }
}
