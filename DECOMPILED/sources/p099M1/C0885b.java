package p099M1;

import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: M1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0885b implements InterfaceC0301v {

    /* JADX INFO: renamed from: a */
    private final byte[] f3475a;

    public C0885b(byte[] bArr) {
        this.f3475a = (byte[]) AbstractC2022k.m8408e(bArr);
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f3475a;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public void mo1436b() {
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return this.f3475a.length;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return byte[].class;
    }
}
