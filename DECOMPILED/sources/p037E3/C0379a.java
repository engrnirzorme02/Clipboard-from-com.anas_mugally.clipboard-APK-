package p037E3;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: renamed from: E3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0379a {
    /* JADX INFO: renamed from: a */
    public float m1613a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
