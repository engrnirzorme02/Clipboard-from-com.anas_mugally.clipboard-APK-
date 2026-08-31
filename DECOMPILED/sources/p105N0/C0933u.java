package p105N0;

import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.AbstractC0880j;
import p098M0.InterfaceC0883m;

/* JADX INFO: renamed from: N0.u */
/* JADX INFO: loaded from: classes.dex */
public class C0933u implements WebViewStartUpCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a */
    private final AbstractC0880j.d f3645a;

    /* JADX INFO: renamed from: N0.u$a */
    class a implements InterfaceC0883m {

        /* JADX INFO: renamed from: a */
        private final List f3646a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebViewStartUpResultBoundaryInterface f3647b;

        a(WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
            this.f3647b = webViewStartUpResultBoundaryInterface;
            this.f3646a = m4172a(webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations());
        }

        /* JADX INFO: renamed from: a */
        private List m4172a(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((Throwable) it.next()));
            }
            return arrayList;
        }

        @Override // p098M0.InterfaceC0883m
        public Long getTotalTimeInUiThreadMillis() {
            return this.f3647b.getTotalTimeInUiThreadMillis();
        }
    }

    /* JADX INFO: renamed from: N0.u$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final Throwable f3649a;

        b(Throwable th) {
            this.f3649a = th;
        }
    }

    public C0933u(AbstractC0880j.d dVar) {
        this.f3645a = dVar;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0883m m4171a(WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        return new a(webViewStartUpResultBoundaryInterface);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) AbstractC0764a.m3594a(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        this.f3645a.onSuccess(m4171a(webViewStartUpResultBoundaryInterface));
    }
}
