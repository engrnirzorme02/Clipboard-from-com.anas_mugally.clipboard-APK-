package p208b2;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: b2.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2956v {
    /* JADX INFO: renamed from: a */
    static AbstractC2956v m14797a(long j7) {
        return new C2946l(j7);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2956v m14798b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        AbstractC2956v abstractC2956vM14797a = m14797a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return abstractC2956vM14797a;
                    }
                    AbstractC2956v abstractC2956vM14797a2 = m14797a(jsonReader.nextLong());
                    jsonReader.close();
                    return abstractC2956vM14797a2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo14778c();
}
