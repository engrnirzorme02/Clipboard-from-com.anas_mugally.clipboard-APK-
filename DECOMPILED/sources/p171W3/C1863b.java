package p171W3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.firebase.analytics.connector.internal.AbstractC4810b;
import com.google.firebase.analytics.connector.internal.C4812d;
import com.google.firebase.analytics.connector.internal.C4814f;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p116O4.AbstractC1145a;
import p116O4.InterfaceC1148d;
import p164V3.AbstractC1757b;
import p164V3.C1762g;
import p275j3.C5862a;

/* JADX INFO: renamed from: W3.b */
/* JADX INFO: loaded from: classes.dex */
public class C1863b implements InterfaceC1862a {

    /* JADX INFO: renamed from: c */
    private static volatile InterfaceC1862a f6014c;

    /* JADX INFO: renamed from: a */
    final C5862a f6015a;

    /* JADX INFO: renamed from: b */
    final Map f6016b;

    /* JADX INFO: renamed from: W3.b$a */
    class a implements InterfaceC1862a.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f6017a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1863b f6018b;

        a(C1863b c1863b, String str) {
            this.f6017a = str;
            Objects.requireNonNull(c1863b);
            this.f6018b = c1863b;
        }
    }

    C1863b(C5862a c5862a) {
        AbstractC3718s.m18083l(c5862a);
        this.f6015a = c5862a;
        this.f6016b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1862a m7658d(C1762g c1762g, Context context, InterfaceC1148d interfaceC1148d) {
        AbstractC3718s.m18083l(c1762g);
        AbstractC3718s.m18083l(context);
        AbstractC3718s.m18083l(interfaceC1148d);
        AbstractC3718s.m18083l(context.getApplicationContext());
        if (f6014c == null) {
            synchronized (C1863b.class) {
                try {
                    if (f6014c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c1762g.m7410w()) {
                            interfaceC1148d.mo4970a(AbstractC1757b.class, ExecutorC1865d.f6020a, C1864c.f6019a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c1762g.m7409v());
                        }
                        f6014c = new C1863b(zzfb.zza(context, bundle).zzb());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6014c;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m7659e(AbstractC1145a abstractC1145a) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m7660f(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f6016b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // p171W3.InterfaceC1862a
    /* JADX INFO: renamed from: a */
    public InterfaceC1862a.a mo7654a(String str, InterfaceC1862a.b bVar) {
        Object c4814f;
        AbstractC3718s.m18083l(bVar);
        if (AbstractC4810b.m21958a(str) && !m7660f(str)) {
            C5862a c5862a = this.f6015a;
            if ("fiam".equals(str)) {
                c4814f = new C4812d(c5862a, bVar);
            } else {
                c4814f = "clx".equals(str) ? new C4814f(c5862a, bVar) : null;
            }
            if (c4814f != null) {
                this.f6016b.put(str, c4814f);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // p171W3.InterfaceC1862a
    /* JADX INFO: renamed from: b */
    public void mo7655b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC4810b.m21958a(str) && AbstractC4810b.m21959b(str2, bundle) && AbstractC4810b.m21962e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f6015a.m26276a(str, str2, bundle);
        }
    }

    @Override // p171W3.InterfaceC1862a
    /* JADX INFO: renamed from: c */
    public void mo7656c(String str, String str2, Object obj) {
        if (AbstractC4810b.m21958a(str) && AbstractC4810b.m21961d(str, str2)) {
            this.f6015a.m26278c(str, str2, obj);
        }
    }
}
