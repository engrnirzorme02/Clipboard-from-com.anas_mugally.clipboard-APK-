package p051G1;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: G1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0475f extends AbstractC0473d {

    /* JADX INFO: renamed from: G1.f$a */
    class a implements AbstractC0473d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f1777a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f1778b;

        a(Context context, String str) {
            this.f1777a = context;
            this.f1778b = str;
        }

        @Override // p051G1.AbstractC0473d.a
        /* JADX INFO: renamed from: a */
        public File mo2038a() {
            File cacheDir = this.f1777a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f1778b != null ? new File(cacheDir, this.f1778b) : cacheDir;
        }
    }

    public C0475f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C0475f(Context context, String str, long j7) {
        super(new a(context, str), j7);
    }
}
