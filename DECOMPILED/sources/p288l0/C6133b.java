package p288l0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.AbstractC0051j;
import p010B0.C0047f;
import p081K.AbstractC0712d;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1610H;
import p344r6.InterfaceC6929n;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6133b {

    /* JADX INFO: renamed from: a */
    private final Map f23890a;

    /* JADX INFO: renamed from: b */
    private final Map f23891b;

    /* JADX INFO: renamed from: c */
    private final Map f23892c;

    /* JADX INFO: renamed from: d */
    private final Map f23893d;

    /* JADX INFO: renamed from: e */
    private final C0047f.b f23894e;

    public C6133b(Map initialState) {
        AbstractC6118n.m27187e(initialState, "initialState");
        this.f23890a = AbstractC1610H.m6638t(initialState);
        this.f23891b = new LinkedHashMap();
        this.f23892c = new LinkedHashMap();
        this.f23893d = new LinkedHashMap();
        this.f23894e = new C0047f.b() { // from class: l0.a
            @Override // p010B0.C0047f.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo174a() {
                return C6133b.m27200c(this.f23889a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Bundle m27200c(C6133b c6133b) {
        C1435m[] c1435mArr;
        for (Map.Entry entry : AbstractC1610H.m6636r(c6133b.f23893d).entrySet()) {
            c6133b.m27202d((String) entry.getKey(), ((InterfaceC6929n) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : AbstractC1610H.m6636r(c6133b.f23891b).entrySet()) {
            c6133b.m27202d((String) entry2.getKey(), ((C0047f.b) entry2.getValue()).mo174a());
        }
        Map map = c6133b.f23890a;
        if (map.isEmpty()) {
            c1435mArr = new C1435m[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(AbstractC1440r.m6083a((String) entry3.getKey(), entry3.getValue()));
            }
            c1435mArr = (C1435m[]) arrayList.toArray(new C1435m[0]);
        }
        Bundle bundleM3458a = AbstractC0712d.m3458a((C1435m[]) Arrays.copyOf(c1435mArr, c1435mArr.length));
        AbstractC0051j.m199a(bundleM3458a);
        return bundleM3458a;
    }

    /* JADX INFO: renamed from: b */
    public final C0047f.b m27201b() {
        return this.f23894e;
    }

    /* JADX INFO: renamed from: d */
    public final void m27202d(String key, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        this.f23890a.put(key, obj);
        InterfaceC6929n interfaceC6929n = (InterfaceC6929n) this.f23892c.get(key);
        if (interfaceC6929n != null) {
            interfaceC6929n.setValue(obj);
        }
        InterfaceC6929n interfaceC6929n2 = (InterfaceC6929n) this.f23893d.get(key);
        if (interfaceC6929n2 != null) {
            interfaceC6929n2.setValue(obj);
        }
    }

    public /* synthetic */ C6133b(Map map, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? AbstractC1610H.m6626h() : map);
    }
}
