package p314o2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3385q2;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: o2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6571w {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3328c1 f24784a;

    /* JADX INFO: renamed from: b */
    private final List f24785b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private C6558j f24786c;

    private C6571w(InterfaceC3328c1 interfaceC3328c1) {
        this.f24784a = interfaceC3328c1;
        if (interfaceC3328c1 != null) {
            try {
                List listZzg = interfaceC3328c1.zzg();
                if (listZzg != null) {
                    Iterator it = listZzg.iterator();
                    while (it.hasNext()) {
                        C6558j c6558jM27842e = C6558j.m27842e((C3385q2) it.next());
                        if (c6558jM27842e != null) {
                            this.f24785b.add(c6558jM27842e);
                        }
                    }
                }
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("Could not forward getAdapterResponseInfo to ResponseInfo.", e7);
            }
        }
        InterfaceC3328c1 interfaceC3328c2 = this.f24784a;
        if (interfaceC3328c2 == null) {
            return;
        }
        try {
            C3385q2 c3385q2Zzh = interfaceC3328c2.zzh();
            if (c3385q2Zzh != null) {
                this.f24786c = C6558j.m27842e(c3385q2Zzh);
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e8);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C6571w m27861e(InterfaceC3328c1 interfaceC3328c1) {
        if (interfaceC3328c1 != null) {
            return new C6571w(interfaceC3328c1);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C6571w m27862f(InterfaceC3328c1 interfaceC3328c1) {
        return new C6571w(interfaceC3328c1);
    }

    /* JADX INFO: renamed from: a */
    public String m27863a() {
        try {
            InterfaceC3328c1 interfaceC3328c1 = this.f24784a;
            if (interfaceC3328c1 != null) {
                return interfaceC3328c1.zze();
            }
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public Bundle m27864b() {
        try {
            InterfaceC3328c1 interfaceC3328c1 = this.f24784a;
            if (interfaceC3328c1 != null) {
                return interfaceC3328c1.zzi();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Could not forward getResponseExtras to ResponseInfo.", e7);
        }
        return new Bundle();
    }

    /* JADX INFO: renamed from: c */
    public String m27865c() {
        try {
            InterfaceC3328c1 interfaceC3328c1 = this.f24784a;
            if (interfaceC3328c1 != null) {
                return interfaceC3328c1.zzf();
            }
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Could not forward getResponseId to ResponseInfo.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m27866d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strM27865c = m27865c();
        if (strM27865c == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strM27865c);
        }
        String strM27863a = m27863a();
        if (strM27863a == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strM27863a);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f24785b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C6558j) it.next()).m27847f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        C6558j c6558j = this.f24786c;
        if (c6558j != null) {
            jSONObject.put("Loaded Adapter Response", c6558j.m27847f());
        }
        Bundle bundleM27864b = m27864b();
        if (bundleM27864b != null) {
            jSONObject.put("Response Extras", C3244B.m17190a().m33298u(bundleM27864b));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC3328c1 m27867g() {
        return this.f24784a;
    }

    public String toString() {
        try {
            return m27866d().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
