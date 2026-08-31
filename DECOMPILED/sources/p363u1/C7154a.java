package p363u1;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.AbstractC2633Z;
import androidx.lifecycle.AbstractC2664z;
import androidx.lifecycle.C2611C;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.models.ApiResponse;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p000.C2974c;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p355t1.AbstractC7071b;
import p355t1.C7070a;

/* JADX INFO: renamed from: u1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7154a extends AbstractC2632Y {

    /* JADX INFO: renamed from: b */
    private final C2974c f28566b = new C2974c();

    /* JADX INFO: renamed from: c */
    private final FirebaseAuth f28567c;

    /* JADX INFO: renamed from: d */
    private final C2611C f28568d;

    /* JADX INFO: renamed from: e */
    private final AbstractC2664z f28569e;

    /* JADX INFO: renamed from: f */
    private final C2611C f28570f;

    /* JADX INFO: renamed from: g */
    private final AbstractC2664z f28571g;

    /* JADX INFO: renamed from: u1.a$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28572a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f28574c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f28575d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f28576e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ AiPrompt f28577f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ String f28578r;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ Context f28579s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3, AiPrompt aiPrompt, String str4, Context context, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f28574c = str;
            this.f28575d = str2;
            this.f28576e = str3;
            this.f28577f = aiPrompt;
            this.f28578r = str4;
            this.f28579s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C7154a.this.new a(this.f28574c, this.f28575d, this.f28576e, this.f28577f, this.f28578r, this.f28579s, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x006c A[Catch: Exception -> 0x0069, TryCatch #1 {Exception -> 0x0069, blocks: (B:17:0x0047, B:19:0x004f, B:21:0x0055, B:24:0x006c, B:27:0x0077, B:29:0x00ab, B:14:0x0040), top: B:38:0x0040 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ab A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #1 {Exception -> 0x0069, blocks: (B:17:0x0047, B:19:0x004f, B:21:0x0055, B:24:0x006c, B:27:0x0077, B:29:0x00ab, B:14:0x0040), top: B:38:0x0040 }] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Exception exc;
            ApiResponse apiResponse;
            C7070a c7070a;
            String errorCode;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28572a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C7154a.this.f28568d.mo12526q(AbstractC7071b.b.f28237a);
                try {
                    C2974c c2974c = C7154a.this.f28566b;
                    String str = this.f28574c;
                    String str2 = this.f28575d;
                    String str3 = this.f28576e;
                    AiPrompt aiPrompt = this.f28577f;
                    String str4 = this.f28578r;
                    this.f28572a = 1;
                    aVar = this;
                    try {
                        obj = c2974c.m14833l(str, str2, str3, aiPrompt, str4, aVar);
                        if (obj == objE) {
                            return objE;
                        }
                        apiResponse = (ApiResponse) obj;
                        if (apiResponse.getSuccess()) {
                            c7070a = C7070a.f28232a;
                            Context context = aVar.f28579s;
                            errorCode = apiResponse.getErrorCode();
                            if (errorCode == null) {
                                errorCode = "UNKNOWN_ERROR";
                            }
                            C7154a.this.f28568d.mo12526q(new AbstractC7071b.a(c7070a.m31170a(context, errorCode), c7070a.m31171b(apiResponse.getErrorCode()), c7070a.m31174e(apiResponse.getErrorCode()), c7070a.m31173d(apiResponse.getErrorCode())));
                            if (c7070a.m31172c(apiResponse.getErrorCode())) {
                                C7154a.this.f28570f.mo12526q(AbstractC6087b.m27120a(true));
                            }
                        } else {
                            c7070a = C7070a.f28232a;
                            Context context2 = aVar.f28579s;
                            errorCode = apiResponse.getErrorCode();
                            if (errorCode == null) {
                                errorCode = "UNKNOWN_ERROR";
                            }
                            C7154a.this.f28568d.mo12526q(new AbstractC7071b.a(c7070a.m31170a(context2, errorCode), c7070a.m31171b(apiResponse.getErrorCode()), c7070a.m31174e(apiResponse.getErrorCode()), c7070a.m31173d(apiResponse.getErrorCode())));
                            if (c7070a.m31172c(apiResponse.getErrorCode())) {
                                C7154a.this.f28570f.mo12526q(AbstractC6087b.m27120a(true));
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        exc = e;
                        Log.e("AiTextViewModel", "Error processing text", exc);
                        C7154a.this.f28568d.mo12526q(new AbstractC7071b.a(C7070a.f28232a.m31170a(aVar.f28579s, "UNKNOWN_ERROR"), false, false, false, 14, null));
                    }
                } catch (Exception e8) {
                    e = e8;
                    aVar = this;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC1437o.m6082b(obj);
                    aVar = this;
                    apiResponse = (ApiResponse) obj;
                    if (apiResponse.getSuccess() || apiResponse.getResult() == null) {
                        c7070a = C7070a.f28232a;
                        Context context3 = aVar.f28579s;
                        errorCode = apiResponse.getErrorCode();
                        if (errorCode == null) {
                            errorCode = "UNKNOWN_ERROR";
                        }
                        C7154a.this.f28568d.mo12526q(new AbstractC7071b.a(c7070a.m31170a(context3, errorCode), c7070a.m31171b(apiResponse.getErrorCode()), c7070a.m31174e(apiResponse.getErrorCode()), c7070a.m31173d(apiResponse.getErrorCode())));
                        if (c7070a.m31172c(apiResponse.getErrorCode())) {
                            C7154a.this.f28570f.mo12526q(AbstractC6087b.m27120a(true));
                        }
                    } else {
                        C7154a.this.f28568d.mo12526q(new AbstractC7071b.c(apiResponse.getResult()));
                    }
                } catch (Exception e9) {
                    exc = e9;
                    aVar = this;
                    Log.e("AiTextViewModel", "Error processing text", exc);
                    C7154a.this.f28568d.mo12526q(new AbstractC7071b.a(C7070a.f28232a.m31170a(aVar.f28579s, "UNKNOWN_ERROR"), false, false, false, 14, null));
                }
            }
            return C1444v.f4971a;
        }
    }

    public C7154a() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        AbstractC6118n.m27186d(firebaseAuth, "getInstance(...)");
        this.f28567c = firebaseAuth;
        C2611C c2611c = new C2611C();
        this.f28568d = c2611c;
        this.f28569e = c2611c;
        C2611C c2611c2 = new C2611C();
        this.f28570f = c2611c2;
        this.f28571g = c2611c2;
    }

    /* JADX INFO: renamed from: h */
    public final void m31641h() {
        this.f28570f.mo12526q(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC2664z m31642i() {
        return this.f28571g;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC2664z m31643j() {
        return this.f28569e;
    }

    /* JADX INFO: renamed from: k */
    public final void m31644k(Context context, String originalText, AiPrompt aiPrompt, String str, String str2, String uid) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(originalText, "originalText");
        AbstractC6118n.m27187e(aiPrompt, "aiPrompt");
        AbstractC6118n.m27187e(uid, "uid");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), null, null, new a(uid, str, originalText, aiPrompt, str2, context, null), 3, null);
    }
}
