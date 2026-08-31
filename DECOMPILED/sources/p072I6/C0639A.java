package p072I6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.A */
/* JADX INFO: loaded from: classes.dex */
final class C0639A extends C0646c {

    /* JADX INFO: renamed from: o */
    private final Socket f2528o;

    public C0639A(Socket socket) {
        AbstractC6118n.m27187e(socket, "socket");
        this.f2528o = socket;
    }

    @Override // p072I6.C0646c
    /* JADX INFO: renamed from: C */
    protected void mo2946C() {
        try {
            this.f2528o.close();
        } catch (AssertionError e7) {
            if (!AbstractC0659p.m3133e(e7)) {
                throw e7;
            }
            AbstractC0660q.f2584a.log(Level.WARNING, "Failed to close timed out socket " + this.f2528o, (Throwable) e7);
        } catch (Exception e8) {
            AbstractC0660q.f2584a.log(Level.WARNING, "Failed to close timed out socket " + this.f2528o, (Throwable) e8);
        }
    }

    @Override // p072I6.C0646c
    /* JADX INFO: renamed from: y */
    protected IOException mo2947y(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
