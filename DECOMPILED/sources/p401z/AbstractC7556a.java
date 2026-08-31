package p401z;

import android.view.View;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7556a {
    /* JADX INFO: renamed from: a */
    public static String m33256a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
