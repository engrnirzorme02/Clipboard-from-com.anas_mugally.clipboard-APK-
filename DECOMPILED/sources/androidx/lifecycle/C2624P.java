package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.AbstractC0044c;
import p010B0.AbstractC0051j;
import p010B0.C0047f;
import p081K.AbstractC0712d;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: androidx.lifecycle.P */
/* JADX INFO: loaded from: classes.dex */
public final class C2624P implements C0047f.b {

    /* JADX INFO: renamed from: a */
    private final C0047f f10420a;

    /* JADX INFO: renamed from: b */
    private boolean f10421b;

    /* JADX INFO: renamed from: c */
    private Bundle f10422c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1429g f10423d;

    public C2624P(C0047f savedStateRegistry, final InterfaceC2639c0 viewModelStoreOwner) {
        AbstractC6118n.m27187e(savedStateRegistry, "savedStateRegistry");
        AbstractC6118n.m27187e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f10420a = savedStateRegistry;
        this.f10423d = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: androidx.lifecycle.O
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C2624P.m12565f(viewModelStoreOwner);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private final C2625Q m12564d() {
        return (C2625Q) this.f10423d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C2625Q m12565f(InterfaceC2639c0 interfaceC2639c0) {
        return AbstractC2622N.m12561e(interfaceC2639c0);
    }

    @Override // p010B0.C0047f.b
    /* JADX INFO: renamed from: a */
    public Bundle mo174a() {
        C1435m[] c1435mArr;
        Map mapH = AbstractC1610H.m6626h();
        if (mapH.isEmpty()) {
            c1435mArr = new C1435m[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(AbstractC1440r.m6083a((String) entry.getKey(), entry.getValue()));
            }
            c1435mArr = (C1435m[]) arrayList.toArray(new C1435m[0]);
        }
        Bundle bundleM3458a = AbstractC0712d.m3458a((C1435m[]) Arrays.copyOf(c1435mArr, c1435mArr.length));
        Bundle bundleM199a = AbstractC0051j.m199a(bundleM3458a);
        Bundle bundle = this.f10422c;
        if (bundle != null) {
            AbstractC0051j.m200b(bundleM199a, bundle);
        }
        for (Map.Entry entry2 : m12564d().m12569e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleMo174a = ((C2619K) entry2.getValue()).m12552a().mo174a();
            if (!AbstractC0044c.m181f(AbstractC0044c.m176a(bundleMo174a))) {
                AbstractC0051j.m201c(bundleM199a, str, bundleMo174a);
            }
        }
        this.f10421b = false;
        return bundleM3458a;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m12566c(String key) {
        C1435m[] c1435mArr;
        AbstractC6118n.m27187e(key, "key");
        m12567e();
        Bundle bundle = this.f10422c;
        if (bundle == null || !AbstractC0044c.m177b(AbstractC0044c.m176a(bundle), key)) {
            return null;
        }
        Bundle bundleM179d = AbstractC0044c.m179d(AbstractC0044c.m176a(bundle), key);
        if (bundleM179d == null) {
            Map mapH = AbstractC1610H.m6626h();
            if (mapH.isEmpty()) {
                c1435mArr = new C1435m[0];
            } else {
                ArrayList arrayList = new ArrayList(mapH.size());
                for (Map.Entry entry : mapH.entrySet()) {
                    arrayList.add(AbstractC1440r.m6083a((String) entry.getKey(), entry.getValue()));
                }
                c1435mArr = (C1435m[]) arrayList.toArray(new C1435m[0]);
            }
            bundleM179d = AbstractC0712d.m3458a((C1435m[]) Arrays.copyOf(c1435mArr, c1435mArr.length));
            AbstractC0051j.m199a(bundleM179d);
        }
        AbstractC0051j.m203e(AbstractC0051j.m199a(bundle), key);
        if (AbstractC0044c.m181f(AbstractC0044c.m176a(bundle))) {
            this.f10422c = null;
        }
        return bundleM179d;
    }

    /* JADX INFO: renamed from: e */
    public final void m12567e() {
        C1435m[] c1435mArr;
        if (this.f10421b) {
            return;
        }
        Bundle bundleM185a = this.f10420a.m185a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapH = AbstractC1610H.m6626h();
        if (mapH.isEmpty()) {
            c1435mArr = new C1435m[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(AbstractC1440r.m6083a((String) entry.getKey(), entry.getValue()));
            }
            c1435mArr = (C1435m[]) arrayList.toArray(new C1435m[0]);
        }
        Bundle bundleM3458a = AbstractC0712d.m3458a((C1435m[]) Arrays.copyOf(c1435mArr, c1435mArr.length));
        Bundle bundleM199a = AbstractC0051j.m199a(bundleM3458a);
        Bundle bundle = this.f10422c;
        if (bundle != null) {
            AbstractC0051j.m200b(bundleM199a, bundle);
        }
        if (bundleM185a != null) {
            AbstractC0051j.m200b(bundleM199a, bundleM185a);
        }
        this.f10422c = bundleM3458a;
        this.f10421b = true;
        m12564d();
    }
}
