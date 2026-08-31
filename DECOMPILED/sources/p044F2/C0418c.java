package p044F2;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbec;
import java.util.Map;

/* JADX INFO: renamed from: F2.c */
/* JADX INFO: loaded from: classes.dex */
public class C0418c {

    /* JADX INFO: renamed from: a */
    private final String f1664a = (String) zzbec.zza.zze();

    /* JADX INFO: renamed from: a */
    public String m1808a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f1664a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
