package com.sap.coe.sf;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.sap.coe.sf package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory
{
	
	private final static QName _SFWebServiceFault_QNAME = new QName(
			"urn:fault.sfapi.successfactors.com", "SFWebServiceFault");
	private final static QName _GetJobResultEmbeddedResponse_QNAME = new QName(
			"urn:sfobject.sfapi.successfactors.com",
			"getJobResultEmbeddedResponse");
	private final static QName _GetJobResultResponse_QNAME = new QName(
			"urn:sfobject.sfapi.successfactors.com", "getJobResultResponse");
	
	
	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.sap.coe.sf
	 * 
	 */
	public ObjectFactory()
	{}
	
	
	/**
	 * Create an instance of {@link FieldEx }
	 * 
	 */
	public FieldEx createFieldEx()
	{
		return new FieldEx();
	}
	
	
	/**
	 * Create an instance of {@link QueryResponse }
	 * 
	 */
	public QueryResponse createQueryResponse()
	{
		return new QueryResponse();
	}
	
	
	/**
	 * Create an instance of {@link Logout }
	 * 
	 */
	public Logout createLogout()
	{
		return new Logout();
	}
	
	
	/**
	 * Create an instance of {@link DescribeSFObjectsEx }
	 * 
	 */
	public DescribeSFObjectsEx createDescribeSFObjectsEx()
	{
		return new DescribeSFObjectsEx();
	}
	
	
	/**
	 * Create an instance of {@link DescribeExResult }
	 * 
	 */
	public DescribeExResult createDescribeExResult()
	{
		return new DescribeExResult();
	}
	
	
	/**
	 * Create an instance of {@link CancelJob }
	 * 
	 */
	public CancelJob createCancelJob()
	{
		return new CancelJob();
	}
	
	
	/**
	 * Create an instance of {@link CancelJobResponse }
	 * 
	 */
	public CancelJobResponse createCancelJobResponse()
	{
		return new CancelJobResponse();
	}
	
	
	/**
	 * Create an instance of {@link IsValidSession }
	 * 
	 */
	public IsValidSession createIsValidSession()
	{
		return new IsValidSession();
	}
	
	
	/**
	 * Create an instance of {@link ListSFObjects }
	 * 
	 */
	public ListSFObjects createListSFObjects()
	{
		return new ListSFObjects();
	}
	
	
	/**
	 * Create an instance of {@link Update }
	 * 
	 */
	public Update createUpdate()
	{
		return new Update();
	}
	
	
	/**
	 * Create an instance of {@link Field }
	 * 
	 */
	public Field createField()
	{
		return new Field();
	}
	
	
	/**
	 * Create an instance of {@link InsertResult }
	 * 
	 */
	public InsertResult createInsertResult()
	{
		return new InsertResult();
	}
	
	
	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse()
	{
		return new DeleteResponse();
	}
	
	
	/**
	 * Create an instance of {@link DescribeResult }
	 * 
	 */
	public DescribeResult createDescribeResult()
	{
		return new DescribeResult();
	}
	
	
	/**
	 * Create an instance of {@link SFParameter }
	 * 
	 */
	public SFParameter createSFParameter()
	{
		return new SFParameter();
	}
	
	
	/**
	 * Create an instance of {@link Upsert }
	 * 
	 */
	public Upsert createUpsert()
	{
		return new Upsert();
	}
	
	
	/**
	 * Create an instance of {@link TaskStatus }
	 * 
	 */
	public TaskStatus createTaskStatus()
	{
		return new TaskStatus();
	}
	
	
	/**
	 * Create an instance of {@link ListJobs }
	 * 
	 */
	public ListJobs createListJobs()
	{
		return new ListJobs();
	}
	
	
	/**
	 * Create an instance of {@link LoginResult }
	 * 
	 */
	public LoginResult createLoginResult()
	{
		return new LoginResult();
	}
	
	
	/**
	 * Create an instance of {@link GetJobResult }
	 * 
	 */
	public GetJobResult createGetJobResult()
	{
		return new GetJobResult();
	}
	
	
	/**
	 * Create an instance of {@link DescribeSFObjectsExResponse }
	 * 
	 */
	public DescribeSFObjectsExResponse createDescribeSFObjectsExResponse()
	{
		return new DescribeSFObjectsExResponse();
	}
	
	
	/**
	 * Create an instance of {@link IsValidSessionResponse }
	 * 
	 */
	public IsValidSessionResponse createIsValidSessionResponse()
	{
		return new IsValidSessionResponse();
	}
	
	
	/**
	 * Create an instance of {@link ListJobsResponse }
	 * 
	 */
	public ListJobsResponse createListJobsResponse()
	{
		return new ListJobsResponse();
	}
	
	
	/**
	 * Create an instance of {@link ObjectEditResult }
	 * 
	 */
	public ObjectEditResult createObjectEditResult()
	{
		return new ObjectEditResult();
	}
	
	
	/**
	 * Create an instance of {@link SubmitQueryJobResponse }
	 * 
	 */
	public SubmitQueryJobResponse createSubmitQueryJobResponse()
	{
		return new SubmitQueryJobResponse();
	}
	
	
	/**
	 * Create an instance of {@link UpdateResult }
	 * 
	 */
	public UpdateResult createUpdateResult()
	{
		return new UpdateResult();
	}
	
	
	/**
	 * Create an instance of {@link QueryResult }
	 * 
	 */
	public QueryResult createQueryResult()
	{
		return new QueryResult();
	}
	
	
	/**
	 * Create an instance of {@link EntityInfo }
	 * 
	 */
	public EntityInfo createEntityInfo()
	{
		return new EntityInfo();
	}
	
	
	/**
	 * Create an instance of {@link SFWebServiceFaultException }
	 * 
	 */
	public SFWebServiceFaultException createSFWebServiceFaultException()
	{
		return new SFWebServiceFaultException();
	}
	
	
	/**
	 * Create an instance of {@link DescribeSFObjects }
	 * 
	 */
	public DescribeSFObjects createDescribeSFObjects()
	{
		return new DescribeSFObjects();
	}
	
	
	/**
	 * Create an instance of {@link Login }
	 * 
	 */
	public Login createLogin()
	{
		return new Login();
	}
	
	
	/**
	 * Create an instance of {@link Picklist }
	 * 
	 */
	public Picklist createPicklist()
	{
		return new Picklist();
	}
	
	
	/**
	 * Create an instance of {@link ListSFObjectsResponse }
	 * 
	 */
	public ListSFObjectsResponse createListSFObjectsResponse()
	{
		return new ListSFObjectsResponse();
	}
	
	
	/**
	 * Create an instance of {@link UpdateResponse }
	 * 
	 */
	public UpdateResponse createUpdateResponse()
	{
		return new UpdateResponse();
	}
	
	
	/**
	 * Create an instance of {@link QueryMore }
	 * 
	 */
	public QueryMore createQueryMore()
	{
		return new QueryMore();
	}
	
	
	/**
	 * Create an instance of {@link Insert }
	 * 
	 */
	public Insert createInsert()
	{
		return new Insert();
	}
	
	
	/**
	 * Create an instance of {@link UpsertResponse }
	 * 
	 */
	public UpsertResponse createUpsertResponse()
	{
		return new UpsertResponse();
	}
	
	
	/**
	 * Create an instance of {@link BusinessKeys }
	 * 
	 */
	public BusinessKeys createBusinessKeys()
	{
		return new BusinessKeys();
	}
	
	
	/**
	 * Create an instance of {@link QueryMoreResponse }
	 * 
	 */
	public QueryMoreResponse createQueryMoreResponse()
	{
		return new QueryMoreResponse();
	}
	
	
	/**
	 * Create an instance of {@link GetJobResultEmbedded }
	 * 
	 */
	public GetJobResultEmbedded createGetJobResultEmbedded()
	{
		return new GetJobResultEmbedded();
	}
	
	
	/**
	 * Create an instance of {@link LoginResponse }
	 * 
	 */
	public LoginResponse createLoginResponse()
	{
		return new LoginResponse();
	}
	
	
	/**
	 * Create an instance of {@link GetJobStatusResponse }
	 * 
	 */
	public GetJobStatusResponse createGetJobStatusResponse()
	{
		return new GetJobStatusResponse();
	}
	
	
	/**
	 * Create an instance of {@link Query }
	 * 
	 */
	public Query createQuery()
	{
		return new Query();
	}
	
	
	/**
	 * Create an instance of {@link TaskResultStatus }
	 * 
	 */
	public TaskResultStatus createTaskResultStatus()
	{
		return new TaskResultStatus();
	}
	
	
	/**
	 * Create an instance of {@link Label }
	 * 
	 */
	public Label createLabel()
	{
		return new Label();
	}
	
	
	/**
	 * Create an instance of {@link Error }
	 * 
	 */
	public Error createError()
	{
		return new Error();
	}
	
	
	/**
	 * Create an instance of {@link UpsertResult }
	 * 
	 */
	public UpsertResult createUpsertResult()
	{
		return new UpsertResult();
	}
	
	
	/**
	 * Create an instance of {@link GetJobResultMTOMRS }
	 * 
	 */
	public GetJobResultMTOMRS createGetJobResultMTOMRS()
	{
		return new GetJobResultMTOMRS();
	}
	
	
	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete()
	{
		return new Delete();
	}
	
	
	/**
	 * Create an instance of {@link PicklistOption }
	 * 
	 */
	public PicklistOption createPicklistOption()
	{
		return new PicklistOption();
	}
	
	
	/**
	 * Create an instance of {@link GetJobStatus }
	 * 
	 */
	public GetJobStatus createGetJobStatus()
	{
		return new GetJobStatus();
	}
	
	
	/**
	 * Create an instance of {@link InsertResponse }
	 * 
	 */
	public InsertResponse createInsertResponse()
	{
		return new InsertResponse();
	}
	
	
	/**
	 * Create an instance of {@link DescribeSFObjectsResponse }
	 * 
	 */
	public DescribeSFObjectsResponse createDescribeSFObjectsResponse()
	{
		return new DescribeSFObjectsResponse();
	}
	
	
	/**
	 * Create an instance of {@link LogoutResponse }
	 * 
	 */
	public LogoutResponse createLogoutResponse()
	{
		return new LogoutResponse();
	}
	
	
	/**
	 * Create an instance of {@link DeleteResult }
	 * 
	 */
	public DeleteResult createDeleteResult()
	{
		return new DeleteResult();
	}
	
	
	/**
	 * Create an instance of {@link GetJobResultMTOMRQ }
	 * 
	 */
	public GetJobResultMTOMRQ createGetJobResultMTOMRQ()
	{
		return new GetJobResultMTOMRQ();
	}
	
	
	/**
	 * Create an instance of {@link SFObject }
	 * 
	 */
	public SFObject createSFObject()
	{
		return new SFObject();
	}
	
	
	/**
	 * Create an instance of {@link SubmitQueryJob }
	 * 
	 */
	public SubmitQueryJob createSubmitQueryJob()
	{
		return new SubmitQueryJob();
	}
	
	
	/**
	 * Create an instance of {@link SFCredential }
	 * 
	 */
	public SFCredential createSFCredential()
	{
		return new SFCredential();
	}
	
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SFWebServiceFaultException }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:fault.sfapi.successfactors.com",
					name = "SFWebServiceFault")
	public JAXBElement<SFWebServiceFaultException> createSFWebServiceFault(
			SFWebServiceFaultException value)
	{
		return new JAXBElement<SFWebServiceFaultException>(
				_SFWebServiceFault_QNAME, SFWebServiceFaultException.class,
				null, value);
	}
	
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DataHandler }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:sfobject.sfapi.successfactors.com",
					name = "getJobResultEmbeddedResponse")
	@XmlMimeType("application/octet-stream")
	public JAXBElement<DataHandler> createGetJobResultEmbeddedResponse(
			DataHandler value)
	{
		return new JAXBElement<DataHandler>(
				_GetJobResultEmbeddedResponse_QNAME, DataHandler.class, null,
				value);
	}
	
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DataHandler }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:sfobject.sfapi.successfactors.com",
					name = "getJobResultResponse")
	@XmlMimeType("application/octet-stream")
	public
			JAXBElement<DataHandler>
			createGetJobResultResponse(DataHandler value)
	{
		return new JAXBElement<DataHandler>(_GetJobResultResponse_QNAME,
				DataHandler.class, null, value);
	}
	
}
