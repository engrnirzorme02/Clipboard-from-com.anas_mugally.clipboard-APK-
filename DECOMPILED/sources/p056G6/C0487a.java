package p056G6;

import androidx.appcompat.app.AbstractC2263x;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p286k6.InterfaceC6077c;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: G6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0487a extends AbstractC0488b {

    /* JADX INFO: renamed from: a */
    private final Map f1836a;

    /* JADX INFO: renamed from: b */
    public final Map f1837b;

    /* JADX INFO: renamed from: c */
    private final Map f1838c;

    /* JADX INFO: renamed from: d */
    private final Map f1839d;

    /* JADX INFO: renamed from: e */
    private final Map f1840e;

    /* JADX INFO: renamed from: f */
    private final boolean f1841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0487a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z7) {
        super(null);
        AbstractC6118n.m27187e(class2ContextualFactory, "class2ContextualFactory");
        AbstractC6118n.m27187e(polyBase2Serializers, "polyBase2Serializers");
        AbstractC6118n.m27187e(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC6118n.m27187e(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC6118n.m27187e(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f1836a = class2ContextualFactory;
        this.f1837b = polyBase2Serializers;
        this.f1838c = polyBase2DefaultSerializerProvider;
        this.f1839d = polyBase2NamedSerializers;
        this.f1840e = polyBase2DefaultDeserializerProvider;
        this.f1841f = z7;
    }

    @Override // p056G6.AbstractC0488b
    /* JADX INFO: renamed from: a */
    public InterfaceC7616b mo2087a(InterfaceC6077c kClass, List typeArgumentsSerializers) {
        AbstractC6118n.m27187e(kClass, "kClass");
        AbstractC6118n.m27187e(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC2263x.m9328a(this.f1836a.get(kClass));
        return null;
    }
}
