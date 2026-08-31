package p283k3;

/* JADX INFO: renamed from: k3.G */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6024G {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a */
    private final int f23806a;

    EnumC6024G(int i7) {
        this.f23806a = i7;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC6024G m27044c(int i7) {
        for (EnumC6024G enumC6024G : values()) {
            if (enumC6024G.f23806a == i7) {
                return enumC6024G;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f23806a;
    }
}
