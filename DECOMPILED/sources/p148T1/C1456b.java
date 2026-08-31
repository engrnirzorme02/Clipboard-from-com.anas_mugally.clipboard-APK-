package p148T1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: T1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1456b {

    /* JADX INFO: renamed from: a */
    private final List f4985a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public synchronized void m6106a(ImageHeaderParser imageHeaderParser) {
        this.f4985a.add(imageHeaderParser);
    }

    /* JADX INFO: renamed from: b */
    public synchronized List m6107b() {
        return this.f4985a;
    }
}
