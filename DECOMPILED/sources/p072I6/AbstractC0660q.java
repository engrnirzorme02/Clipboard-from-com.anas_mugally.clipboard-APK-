package p072I6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: I6.q */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0660q {

    /* JADX INFO: renamed from: a */
    private static final Logger f2584a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0669z m3142b(File file) {
        AbstractC6118n.m27187e(file, "<this>");
        return AbstractC0659p.m3135g(new FileOutputStream(file, true));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3143c(AssertionError assertionError) {
        AbstractC6118n.m27187e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC6406h.m27589Q(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0669z m3144d(File file, boolean z7) {
        AbstractC6118n.m27187e(file, "<this>");
        return AbstractC0659p.m3135g(new FileOutputStream(file, z7));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0669z m3145e(OutputStream outputStream) {
        AbstractC6118n.m27187e(outputStream, "<this>");
        return new C0663t(outputStream, new C0641C());
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0669z m3146f(Socket socket) throws IOException {
        AbstractC6118n.m27187e(socket, "<this>");
        C0639A c0639a = new C0639A(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC6118n.m27186d(outputStream, "getOutputStream(...)");
        return c0639a.m2991A(new C0663t(outputStream, c0639a));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC0669z m3147g(File file, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return AbstractC0659p.m3134f(file, z7);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0640B m3148h(File file) {
        AbstractC6118n.m27187e(file, "<this>");
        return new C0658o(new FileInputStream(file), C0641C.f2530e);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0640B m3149i(InputStream inputStream) {
        AbstractC6118n.m27187e(inputStream, "<this>");
        return new C0658o(inputStream, new C0641C());
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC0640B m3150j(Socket socket) throws IOException {
        AbstractC6118n.m27187e(socket, "<this>");
        C0639A c0639a = new C0639A(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC6118n.m27186d(inputStream, "getInputStream(...)");
        return c0639a.m2992B(new C0658o(inputStream, c0639a));
    }
}
