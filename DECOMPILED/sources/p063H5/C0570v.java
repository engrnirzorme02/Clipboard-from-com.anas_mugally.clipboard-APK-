package p063H5;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p122P3.AbstractC1209m;
import p122P3.C1202f;

/* JADX INFO: renamed from: H5.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0570v {

    /* JADX INFO: renamed from: c */
    static final C1202f f2199c = C1202f.m5260e(',');

    /* JADX INFO: renamed from: d */
    private static final C0570v f2200d = m2526a().m2531f(new InterfaceC0553l.a(), true).m2531f(InterfaceC0553l.b.f2096a, false);

    /* JADX INFO: renamed from: a */
    private final Map f2201a;

    /* JADX INFO: renamed from: b */
    private final byte[] f2202b;

    /* JADX INFO: renamed from: H5.v$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        final InterfaceC0569u f2203a;

        /* JADX INFO: renamed from: b */
        final boolean f2204b;

        a(InterfaceC0569u interfaceC0569u, boolean z7) {
            this.f2203a = (InterfaceC0569u) AbstractC1209m.m5303o(interfaceC0569u, "decompressor");
            this.f2204b = z7;
        }
    }

    private C0570v(InterfaceC0569u interfaceC0569u, boolean z7, C0570v c0570v) {
        String strMo2443a = interfaceC0569u.mo2443a();
        AbstractC1209m.m5293e(!strMo2443a.contains(","), "Comma is currently not allowed in message encoding");
        int size = c0570v.f2201a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0570v.f2201a.containsKey(interfaceC0569u.mo2443a()) ? size : size + 1);
        for (a aVar : c0570v.f2201a.values()) {
            String strMo2443a2 = aVar.f2203a.mo2443a();
            if (!strMo2443a2.equals(strMo2443a)) {
                linkedHashMap.put(strMo2443a2, new a(aVar.f2203a, aVar.f2204b));
            }
        }
        linkedHashMap.put(strMo2443a, new a(interfaceC0569u, z7));
        this.f2201a = Collections.unmodifiableMap(linkedHashMap);
        this.f2202b = f2199c.m5263c(m2528b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* JADX INFO: renamed from: a */
    public static C0570v m2526a() {
        return new C0570v();
    }

    /* JADX INFO: renamed from: c */
    public static C0570v m2527c() {
        return f2200d;
    }

    /* JADX INFO: renamed from: b */
    public Set m2528b() {
        HashSet hashSet = new HashSet(this.f2201a.size());
        for (Map.Entry entry : this.f2201a.entrySet()) {
            if (((a) entry.getValue()).f2204b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: d */
    byte[] m2529d() {
        return this.f2202b;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0569u m2530e(String str) {
        a aVar = (a) this.f2201a.get(str);
        if (aVar != null) {
            return aVar.f2203a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public C0570v m2531f(InterfaceC0569u interfaceC0569u, boolean z7) {
        return new C0570v(interfaceC0569u, z7, this);
    }

    private C0570v() {
        this.f2201a = new LinkedHashMap(0);
        this.f2202b = new byte[0];
    }
}
