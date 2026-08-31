package p105N0;

import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import p098M0.C0882l;

/* JADX INFO: renamed from: N0.v */
/* JADX INFO: loaded from: classes.dex */
public class C0934v implements WebViewStartUpConfigBoundaryInterface {

    /* JADX INFO: renamed from: a */
    private final C0882l f3650a;

    public C0934v(C0882l c0882l) {
        this.f3650a = c0882l;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return this.f3650a.m4036a();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return this.f3650a.m4037b();
    }
}
