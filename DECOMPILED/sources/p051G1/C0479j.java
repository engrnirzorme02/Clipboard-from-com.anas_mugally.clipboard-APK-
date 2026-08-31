package p051G1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p019C1.InterfaceC0130f;
import p104N.InterfaceC0907d;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;
import p183Y1.C2019h;
import p190Z1.AbstractC2083a;
import p190Z1.AbstractC2085c;

/* JADX INFO: renamed from: G1.j */
/* JADX INFO: loaded from: classes.dex */
public class C0479j {

    /* JADX INFO: renamed from: a */
    private final C2019h f1794a = new C2019h(1000);

    /* JADX INFO: renamed from: b */
    private final InterfaceC0907d f1795b = AbstractC2083a.m8598d(10, new a());

    /* JADX INFO: renamed from: G1.j$a */
    class a implements AbstractC2083a.d {
        a() {
        }

        @Override // p190Z1.AbstractC2083a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo1408a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* JADX INFO: renamed from: G1.j$b */
    private static final class b implements AbstractC2083a.f {

        /* JADX INFO: renamed from: a */
        final MessageDigest f1797a;

        /* JADX INFO: renamed from: b */
        private final AbstractC2085c f1798b = AbstractC2085c.m8610a();

        b(MessageDigest messageDigest) {
            this.f1797a = messageDigest;
        }

        @Override // p190Z1.AbstractC2083a.f
        /* JADX INFO: renamed from: j */
        public AbstractC2085c mo1368j() {
            return this.f1798b;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m2059a(InterfaceC0130f interfaceC0130f) {
        b bVar = (b) AbstractC2022k.m8408e((b) this.f1795b.mo4131b());
        try {
            interfaceC0130f.mo590a(bVar.f1797a);
            return AbstractC2023l.m8433x(bVar.f1797a.digest());
        } finally {
            this.f1795b.mo4130a(bVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2060b(InterfaceC0130f interfaceC0130f) {
        String strM2059a;
        synchronized (this.f1794a) {
            strM2059a = (String) this.f1794a.m8396g(interfaceC0130f);
        }
        if (strM2059a == null) {
            strM2059a = m2059a(interfaceC0130f);
        }
        synchronized (this.f1794a) {
            this.f1794a.m8398k(interfaceC0130f, strM2059a);
        }
        return strM2059a;
    }
}
