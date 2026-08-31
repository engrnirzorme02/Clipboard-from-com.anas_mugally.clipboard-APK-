package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.common.util.AbstractC3756k;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfct {
    public final List zza;
    public final zzfcm zzb;
    public final List zzc;
    public final Bundle zzd;

    zzfct(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.zzd = bundle;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue() && bundle != null) {
            bundle.putLong(zzdru.SERVER_RESPONSE_PARSE_START.zza(), C7351t.m32357o().mo18159a());
        }
        List arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfcm zzfcmVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfcj(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfcmVar = new zzfcm(jsonReader);
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcs)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdru.NORMALIZATION_AD_RESPONSE_START.zza(), zzfcmVar.zzs);
                            bundle.putLong(zzdru.NORMALIZATION_AD_RESPONSE_END.zza(), zzfcmVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectM17477d = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectM17477d = AbstractC3453S.m17477d(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzfcs(strNextString, jSONObjectM17477d));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList2;
        this.zza = arrayList;
        this.zzb = zzfcmVar == null ? new zzfcm(new JsonReader(new StringReader("{}"))) : zzfcmVar;
    }

    public static zzfct zza(Reader reader, Bundle bundle) {
        try {
            try {
                zzfct zzfctVar = new zzfct(new JsonReader(reader), bundle);
                AbstractC3756k.m18186a(reader);
                return zzfctVar;
            } catch (Throwable th) {
                AbstractC3756k.m18186a(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e7) {
            throw new zzfcn("unable to parse ServerResponse", e7);
        }
    }
}
