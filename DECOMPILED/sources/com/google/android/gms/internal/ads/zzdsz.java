package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsz {
    private final InterfaceC3750e zza;

    public zzdsz(InterfaceC3750e interfaceC3750e) {
        this.zza = interfaceC3750e;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbek.zza.zze()).booleanValue()) {
            long jMo18159a = this.zza.mo18159a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jMo18159a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    Object obj = objArr[i7];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e7) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("unable to log", e7);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("AD-DBG ".concat(strValueOf));
        }
    }
}
