package p036E2;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdsg;
import com.google.android.gms.internal.ads.zzdsr;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0366r0 {

    /* JADX INFO: renamed from: h */
    private final zzdsr f1455h;

    /* JADX INFO: renamed from: i */
    private Map f1456i;

    /* JADX INFO: renamed from: f */
    private final ArrayDeque f1453f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    private final ArrayDeque f1454g = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    private final int f1448a = ((Integer) C3250D.m17200c().zzd(zzbci.zzho)).intValue();

    /* JADX INFO: renamed from: b */
    private final long f1449b = ((Long) C3250D.m17200c().zzd(zzbci.zzhp)).longValue();

    /* JADX INFO: renamed from: c */
    private final boolean f1450c = ((Boolean) C3250D.m17200c().zzd(zzbci.zzht)).booleanValue();

    /* JADX INFO: renamed from: d */
    private final boolean f1451d = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhs)).booleanValue();

    /* JADX INFO: renamed from: e */
    private final Map f1452e = Collections.synchronizedMap(new C0360o0(this));

    public C0366r0(zzdsr zzdsrVar) {
        this.f1455h = zzdsrVar;
    }

    /* JADX INFO: renamed from: i */
    private final synchronized void m1550i() {
        long jMo18159a = C7351t.m32357o().mo18159a();
        try {
            Iterator it = this.f1452e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jMo18159a - ((C0362p0) entry.getValue()).f1438a.longValue() <= this.f1449b) {
                    break;
                }
                this.f1454g.add(new Pair((String) entry.getKey(), ((C0362p0) entry.getValue()).f1439b));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e7) {
            C7351t.m32354l().zzg(e7, "QueryJsonMap.removeExpiredEntries");
        }
    }

    /* JADX INFO: renamed from: j */
    private final synchronized void m1551j(final zzdsg zzdsgVar) {
        if (this.f1450c) {
            ArrayDeque arrayDeque = this.f1454g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f1453f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzbzh.zza.execute(new Runnable() { // from class: E2.q0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f1443a.m1559f(zzdsgVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m1552k(zzdsg zzdsgVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsgVar.zzc());
            this.f1456i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f1456i.put("e_r", str);
            this.f1456i.put("e_id", (String) pair2.first);
            if (this.f1451d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(AbstractC0335c.m1520b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m1553l(this.f1456i, "e_type", (String) pair.first);
                m1553l(this.f1456i, "e_agent", (String) pair.second);
            }
            this.f1455h.zzb(this.f1456i);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final void m1553l(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1554a(String str, String str2, zzdsg zzdsgVar) {
        this.f1452e.put(str, new C0362p0(Long.valueOf(C7351t.m32357o().mo18159a()), str2, new HashSet()));
        m1550i();
        m1551j(zzdsgVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m1555b(String str, zzdsg zzdsgVar) {
        C0362p0 c0362p0 = (C0362p0) this.f1452e.get(str);
        zzdsgVar.zzc().put("request_id", str);
        if (c0362p0 == null) {
            zzdsgVar.zzc().put("mhit", "false");
            return null;
        }
        zzdsgVar.zzc().put("mhit", "true");
        return c0362p0.f1439b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m1556c(String str) {
        this.f1452e.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m1557d(String str, String str2) {
        C0362p0 c0362p0 = (C0362p0) this.f1452e.get(str);
        return c0362p0 != null && c0362p0.f1440c.contains(str2);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m1558e(String str, String str2, int i7) {
        C0362p0 c0362p0 = (C0362p0) this.f1452e.get(str);
        if (c0362p0 == null) {
            return false;
        }
        Set set = c0362p0.f1440c;
        set.add(str2);
        return set.size() < i7;
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ void m1559f(zzdsg zzdsgVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m1552k(zzdsgVar, arrayDeque, "to");
        m1552k(zzdsgVar, arrayDeque2, "of");
    }

    /* JADX INFO: renamed from: g */
    final /* synthetic */ int m1560g() {
        return this.f1448a;
    }

    /* JADX INFO: renamed from: h */
    final /* synthetic */ ArrayDeque m1561h() {
        return this.f1453f;
    }
}
