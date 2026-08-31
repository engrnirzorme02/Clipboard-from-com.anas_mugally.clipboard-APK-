package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.W */
/* JADX INFO: loaded from: classes.dex */
final class C2498W implements InterfaceC2484H {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2486J f9478a;

    /* JADX INFO: renamed from: b */
    private final String f9479b;

    /* JADX INFO: renamed from: c */
    private final Object[] f9480c;

    /* JADX INFO: renamed from: d */
    private final int f9481d;

    C2498W(InterfaceC2486J interfaceC2486J, String str, Object[] objArr) {
        this.f9478a = interfaceC2486J;
        this.f9479b = str;
        this.f9480c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9481d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f9481d = i7 | (cCharAt2 << i8);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2484H
    /* JADX INFO: renamed from: a */
    public boolean mo10893a() {
        return (this.f9481d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2484H
    /* JADX INFO: renamed from: b */
    public InterfaceC2486J mo10894b() {
        return this.f9478a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2484H
    /* JADX INFO: renamed from: c */
    public EnumC2495T mo10895c() {
        int i7 = this.f9481d;
        if ((i7 & 1) != 0) {
            return EnumC2495T.PROTO2;
        }
        return (i7 & 4) == 4 ? EnumC2495T.EDITIONS : EnumC2495T.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    Object[] m10994d() {
        return this.f9480c;
    }

    /* JADX INFO: renamed from: e */
    String m10995e() {
        return this.f9479b;
    }
}
