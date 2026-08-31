package p162V1;

import android.graphics.drawable.Drawable;
import p155U1.InterfaceC1660c;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: V1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1715c implements InterfaceC1720h {

    /* JADX INFO: renamed from: a */
    private final int f5706a;

    /* JADX INFO: renamed from: b */
    private final int f5707b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1660c f5708c;

    public AbstractC1715c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: a */
    public void mo5654a() {
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: b */
    public final void mo7314b(InterfaceC1719g interfaceC1719g) {
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: d */
    public void mo7310d(Drawable drawable) {
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: e */
    public void mo5655e() {
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: f */
    public final void mo7315f(InterfaceC1660c interfaceC1660c) {
        this.f5708c = interfaceC1660c;
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: g */
    public void mo7311g(Drawable drawable) {
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: h */
    public final InterfaceC1660c mo7316h() {
        return this.f5708c;
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: j */
    public final void mo7317j(InterfaceC1719g interfaceC1719g) {
        interfaceC1719g.mo7023d(this.f5706a, this.f5707b);
    }

    @Override // p134R1.InterfaceC1319l
    public void onDestroy() {
    }

    public AbstractC1715c(int i7, int i8) {
        if (AbstractC2023l.m8429t(i7, i8)) {
            this.f5706a = i7;
            this.f5707b = i8;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i7 + " and height: " + i8);
    }
}
