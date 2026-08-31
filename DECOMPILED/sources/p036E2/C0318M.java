package p036E2;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzdru;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: E2.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0318M {

    /* JADX INFO: renamed from: a */
    public final String f1314a;

    /* JADX INFO: renamed from: b */
    public String f1315b;

    /* JADX INFO: renamed from: d */
    public zzbuv f1317d;

    /* JADX INFO: renamed from: e */
    public Bundle f1318e;

    /* JADX INFO: renamed from: g */
    private long f1320g;

    /* JADX INFO: renamed from: h */
    private long f1321h;

    /* JADX INFO: renamed from: c */
    public String f1316c = null;

    /* JADX INFO: renamed from: f */
    public Bundle f1319f = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public C0318M(JsonReader jsonReader, zzbuv zzbuvVar) throws IOException {
        Bundle bundle;
        byte b7;
        this.f1320g = -1L;
        this.f1321h = -1L;
        this.f1317d = zzbuvVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b7 = 2;
                    break;
                case "params":
                    b7 = 0;
                    break;
                case "signal_dictionary":
                    b7 = 1;
                    break;
                case "end_time":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                strNextString = jsonReader.nextString();
            } else if (b7 == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b7 == 2) {
                this.f1320g = jsonReader.nextLong();
            } else if (b7 != 3) {
                jsonReader.skipValue();
            } else {
                this.f1321h = jsonReader.nextLong();
            }
        }
        this.f1314a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f1319f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue() || zzbuvVar == null || (bundle = zzbuvVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdru.GET_SIGNALS_SDKCORE_START.zza(), this.f1320g);
        zzbuvVar.zzm.putLong(zzdru.GET_SIGNALS_SDKCORE_END.zza(), this.f1321h);
    }
}
