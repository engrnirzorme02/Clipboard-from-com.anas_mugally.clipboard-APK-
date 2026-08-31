package p045F3;

import android.graphics.Typeface;

/* JADX INFO: renamed from: F3.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0421a extends AbstractC0426f {

    /* JADX INFO: renamed from: a */
    private final Typeface f1666a;

    /* JADX INFO: renamed from: b */
    private final a f1667b;

    /* JADX INFO: renamed from: c */
    private boolean f1668c;

    /* JADX INFO: renamed from: F3.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1816a(Typeface typeface);
    }

    public C0421a(a aVar, Typeface typeface) {
        this.f1666a = typeface;
        this.f1667b = aVar;
    }

    /* JADX INFO: renamed from: d */
    private void m1812d(Typeface typeface) {
        if (this.f1668c) {
            return;
        }
        this.f1667b.mo1816a(typeface);
    }

    @Override // p045F3.AbstractC0426f
    /* JADX INFO: renamed from: a */
    public void mo1813a(int i7) {
        m1812d(this.f1666a);
    }

    @Override // p045F3.AbstractC0426f
    /* JADX INFO: renamed from: b */
    public void mo1814b(Typeface typeface, boolean z7) {
        m1812d(typeface);
    }

    /* JADX INFO: renamed from: c */
    public void m1815c() {
        this.f1668c = true;
    }
}
