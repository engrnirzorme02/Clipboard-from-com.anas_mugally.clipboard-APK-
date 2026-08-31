package p163V2;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: V2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1740k extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z7) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z7);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C1741l.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C1741l.class;
    }
}
