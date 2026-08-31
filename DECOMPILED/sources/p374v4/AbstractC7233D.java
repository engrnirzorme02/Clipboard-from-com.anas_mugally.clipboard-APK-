package p374v4;

import java.util.ArrayList;
import p030D4.C0198b;
import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: v4.D */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC7233D {

    /* JADX INFO: renamed from: v4.D$a */
    public static class a extends AbstractC7233D {

        /* JADX INFO: renamed from: a */
        private final C7258w f28823a;

        /* JADX INFO: renamed from: b */
        private final C7245j f28824b;

        a(C7258w c7258w, C7245j c7245j) {
            this.f28823a = c7258w;
            this.f28824b = c7245j;
        }

        @Override // p374v4.AbstractC7233D
        /* JADX INFO: renamed from: a */
        public AbstractC7233D mo31901a(C0198b c0198b) {
            return new a(this.f28823a, this.f28824b.m31999p(c0198b));
        }

        @Override // p374v4.AbstractC7233D
        /* JADX INFO: renamed from: b */
        public InterfaceC0210n mo31902b() {
            return this.f28823a.m32155I(this.f28824b, new ArrayList());
        }
    }

    /* JADX INFO: renamed from: v4.D$b */
    public static class b extends AbstractC7233D {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0210n f28825a;

        b(InterfaceC0210n interfaceC0210n) {
            this.f28825a = interfaceC0210n;
        }

        @Override // p374v4.AbstractC7233D
        /* JADX INFO: renamed from: a */
        public AbstractC7233D mo31901a(C0198b c0198b) {
            return new b(this.f28825a.mo1008l(c0198b));
        }

        @Override // p374v4.AbstractC7233D
        /* JADX INFO: renamed from: b */
        public InterfaceC0210n mo31902b() {
            return this.f28825a;
        }
    }

    AbstractC7233D() {
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC7233D mo31901a(C0198b c0198b);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0210n mo31902b();
}
