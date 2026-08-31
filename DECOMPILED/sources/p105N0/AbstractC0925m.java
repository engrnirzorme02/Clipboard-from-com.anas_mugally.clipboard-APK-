package p105N0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.AbstractC0875e;
import p098M0.C0874d;

/* JADX INFO: renamed from: N0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0925m implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a */
    private static final String[] f3565a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* JADX INFO: renamed from: a */
    private static AbstractC0875e[] m4156a(InvocationHandler[] invocationHandlerArr) {
        AbstractC0875e[] abstractC0875eArr = new AbstractC0875e[invocationHandlerArr.length];
        for (int i7 = 0; i7 < invocationHandlerArr.length; i7++) {
            abstractC0875eArr[i7] = new C0927o(invocationHandlerArr[i7]);
        }
        return abstractC0875eArr;
    }

    /* JADX INFO: renamed from: b */
    public static C0874d m4157b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        AbstractC0875e[] abstractC0875eArrM4156a = m4156a(webMessageBoundaryInterface.getPorts());
        if (!AbstractC0928p.f3570C.mo4147d()) {
            return new C0874d(webMessageBoundaryInterface.getData(), abstractC0875eArrM4156a);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) AbstractC0764a.m3594a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new C0874d(webMessagePayloadBoundaryInterface.getAsString(), abstractC0875eArrM4156a);
        }
        if (type != 1) {
            return null;
        }
        return new C0874d(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), abstractC0875eArrM4156a);
    }
}
