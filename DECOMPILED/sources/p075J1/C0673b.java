package p075J1;

import android.content.Context;
import android.net.Uri;
import p019C1.C0132h;
import p027D1.AbstractC0183c;
import p027D1.C0184d;
import p067I1.C0598r;
import p067I1.InterfaceC0594n;
import p067I1.InterfaceC0595o;
import p176X1.C1944d;

/* JADX INFO: renamed from: J1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0673b implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final Context f2615a;

    /* JADX INFO: renamed from: J1.b$a */
    public static class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Context f2616a;

        public a(Context context) {
            this.f2616a = context;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0673b(this.f2616a);
        }
    }

    public C0673b(Context context) {
        this.f2615a = context.getApplicationContext();
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        if (AbstractC0183c.m923f(i7, i8)) {
            return new InterfaceC0594n.a(new C1944d(uri), C0184d.m927f(this.f2615a, uri));
        }
        return null;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return AbstractC0183c.m919b(uri);
    }
}
