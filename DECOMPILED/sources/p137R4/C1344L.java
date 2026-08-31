package p137R4;

import com.google.firebase.firestore.C4928n;
import com.google.firebase.firestore.EnumC4934t;
import com.google.firebase.firestore.InterfaceC4925k;
import java.util.ArrayList;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: R4.L */
/* JADX INFO: loaded from: classes.dex */
public class C1344L {

    /* JADX INFO: renamed from: a */
    private final C1343K f4695a;

    /* JADX INFO: renamed from: b */
    private final C1368o.b f4696b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4925k f4697c;

    /* JADX INFO: renamed from: d */
    private boolean f4698d = false;

    /* JADX INFO: renamed from: e */
    private EnumC1341I f4699e = EnumC1341I.UNKNOWN;

    /* JADX INFO: renamed from: f */
    private C1353V f4700f;

    public C1344L(C1343K c1343k, C1368o.b bVar, InterfaceC4925k interfaceC4925k) {
        this.f4695a = c1343k;
        this.f4697c = interfaceC4925k;
        this.f4696b = bVar;
    }

    /* JADX INFO: renamed from: f */
    private void m5771f(C1353V c1353v) {
        AbstractC2034b.m8460d(!this.f4698d, "Trying to raise initial event for second time", new Object[0]);
        C1353V c1353vM5848c = C1353V.m5848c(c1353v.m5855h(), c1353v.m5852e(), c1353v.m5853f(), c1353v.m5858k(), c1353v.m5850b(), c1353v.m5856i());
        this.f4698d = true;
        this.f4697c.mo5870a(c1353vM5848c, null);
    }

    /* JADX INFO: renamed from: g */
    private boolean m5772g(C1353V c1353v) {
        if (!c1353v.m5851d().isEmpty()) {
            return true;
        }
        C1353V c1353v2 = this.f4700f;
        boolean z7 = (c1353v2 == null || c1353v2.m5857j() == c1353v.m5857j()) ? false : true;
        if (c1353v.m5849a() || z7) {
            return this.f4696b.f4820b;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private boolean m5773h(C1353V c1353v, EnumC1341I enumC1341I) {
        AbstractC2034b.m8460d(!this.f4698d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!c1353v.m5858k() || !m5775b()) {
            return true;
        }
        EnumC1341I enumC1341I2 = EnumC1341I.OFFLINE;
        boolean zEquals = enumC1341I.equals(enumC1341I2);
        if (!this.f4696b.f4821c || zEquals) {
            return !c1353v.m5852e().isEmpty() || c1353v.m5856i() || enumC1341I.equals(enumC1341I2);
        }
        AbstractC2034b.m8460d(c1353v.m5858k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public C1343K m5774a() {
        return this.f4695a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5775b() {
        C1368o.b bVar = this.f4696b;
        if (bVar != null) {
            return !bVar.f4822d.equals(EnumC4934t.CACHE);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m5776c(C4928n c4928n) {
        this.f4697c.mo5870a(null, c4928n);
    }

    /* JADX INFO: renamed from: d */
    public boolean m5777d(EnumC1341I enumC1341I) {
        this.f4699e = enumC1341I;
        C1353V c1353v = this.f4700f;
        if (c1353v == null || this.f4698d || !m5773h(c1353v, enumC1341I)) {
            return false;
        }
        m5771f(this.f4700f);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX INFO: renamed from: e */
    public boolean m5778e(C1353V c1353v) {
        boolean z7 = true;
        AbstractC2034b.m8460d(!c1353v.m5851d().isEmpty() || c1353v.m5849a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f4696b.f4819a) {
            ArrayList arrayList = new ArrayList();
            for (C1366m c1366m : c1353v.m5851d()) {
                if (c1366m.m5906c() != C1366m.a.METADATA) {
                    arrayList.add(c1366m);
                }
            }
            c1353v = new C1353V(c1353v.m5855h(), c1353v.m5852e(), c1353v.m5854g(), arrayList, c1353v.m5858k(), c1353v.m5853f(), c1353v.m5849a(), true, c1353v.m5856i());
        }
        if (this.f4698d) {
            if (m5772g(c1353v)) {
                this.f4697c.mo5870a(c1353v, null);
            } else {
                z7 = false;
            }
        } else if (m5773h(c1353v, this.f4699e)) {
            m5771f(c1353v);
        } else {
            z7 = false;
        }
        this.f4700f = c1353v;
        return z7;
    }
}
