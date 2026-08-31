package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcl {
    private String zza;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    zzfcl(JsonReader jsonReader) throws IOException {
        byte b7;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (strNextName.equals("description")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                jsonReader.nextInt();
            } else if (b7 != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }

    public final String zza() {
        return this.zza;
    }
}
