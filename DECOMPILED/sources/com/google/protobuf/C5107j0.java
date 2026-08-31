package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
final class C5107j0 implements InterfaceC5080S {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5082U f19462a;

    /* JADX INFO: renamed from: b */
    private final String f19463b;

    /* JADX INFO: renamed from: c */
    private final Object[] f19464c;

    /* JADX INFO: renamed from: d */
    private final int f19465d;

    C5107j0(InterfaceC5082U interfaceC5082U, String str, Object[] objArr) {
        this.f19462a = interfaceC5082U;
        this.f19463b = str;
        this.f19464c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19465d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f19465d = i7 | (cCharAt2 << i8);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC5080S
    /* JADX INFO: renamed from: a */
    public boolean mo22966a() {
        return (this.f19465d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC5080S
    /* JADX INFO: renamed from: b */
    public InterfaceC5082U mo22967b() {
        return this.f19462a;
    }

    @Override // com.google.protobuf.InterfaceC5080S
    /* JADX INFO: renamed from: c */
    public EnumC5101g0 mo22968c() {
        int i7 = this.f19465d;
        if ((i7 & 1) != 0) {
            return EnumC5101g0.PROTO2;
        }
        return (i7 & 4) == 4 ? EnumC5101g0.EDITIONS : EnumC5101g0.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    Object[] m23283d() {
        return this.f19464c;
    }

    /* JADX INFO: renamed from: e */
    String m23284e() {
        return this.f19463b;
    }
}
