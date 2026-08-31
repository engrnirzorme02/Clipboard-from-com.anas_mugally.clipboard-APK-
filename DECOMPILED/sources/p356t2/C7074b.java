package p356t2;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: t2.b */
/* JADX INFO: loaded from: classes.dex */
final class C7074b extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f28250a;

    C7074b(C7073a c7073a, Map map) {
        this.f28250a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f28250a;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        AbstractC7076d.m31193a(builderBuildUpon.build().toString());
    }
}
