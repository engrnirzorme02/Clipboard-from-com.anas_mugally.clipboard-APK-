package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC2867a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC2867a abstractC2867a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f9281a = (IconCompat) abstractC2867a.m14314v(remoteActionCompat.f9281a, 1);
        remoteActionCompat.f9282b = abstractC2867a.m14304l(remoteActionCompat.f9282b, 2);
        remoteActionCompat.f9283c = abstractC2867a.m14304l(remoteActionCompat.f9283c, 3);
        remoteActionCompat.f9284d = (PendingIntent) abstractC2867a.m14310r(remoteActionCompat.f9284d, 4);
        remoteActionCompat.f9285e = abstractC2867a.m14300h(remoteActionCompat.f9285e, 5);
        remoteActionCompat.f9286f = abstractC2867a.m14300h(remoteActionCompat.f9286f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC2867a abstractC2867a) {
        abstractC2867a.m14316x(false, false);
        abstractC2867a.m14295M(remoteActionCompat.f9281a, 1);
        abstractC2867a.m14286D(remoteActionCompat.f9282b, 2);
        abstractC2867a.m14286D(remoteActionCompat.f9283c, 3);
        abstractC2867a.m14290H(remoteActionCompat.f9284d, 4);
        abstractC2867a.m14318z(remoteActionCompat.f9285e, 5);
        abstractC2867a.m14318z(remoteActionCompat.f9286f, 6);
    }
}
